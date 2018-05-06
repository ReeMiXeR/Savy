package com.vs.shcherbakov.savy.ui.resource_list.presenter

import com.arellomobile.mvp.InjectViewState
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter
import com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector
import com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView
import com.vs.shcherbakov.savy.utils.ioToMainCompletableScheduler
import com.vs.shcherbakov.savy.utils.ioToMainFlowableScheduler
import com.vs.shcherbakov.savy.utils.ioToMainSingleScheduler
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class ResListPresenter : BasePresenter<ResourceListView>() {

    @Inject
    lateinit var resListInteractor: ResListInterector
    private var listSize = 0

    init {
        App.resourceListComponent.inject(this)
    }

    override fun onFirstViewAttach() {
        viewState.showLoading()
    }

    fun resolveResourceClick(resource: ResItem) {
        if (resource.isDir) {
            resource.path?.let {
                viewState.openPath(it)
            }
        } else {
            viewState.showDownloadProgress()
            safeSubscribe {
                resListInteractor.downloadResource(resource)
                        .compose(ioToMainSingleScheduler())
                        .subscribe({
                            viewState.hideDownloadProgress()
                            viewState.openFile(it, resource)
                        }, {
                            viewState.hideDownloadProgress()
                            viewState.showToast("Ошибка при загрузке " + resource.name)
                        })
            }
        }
    }

    fun loadListItems(path: String) {
        safeSubscribe {
            resListInteractor.init(path)
                    .compose(ioToMainCompletableScheduler())
                    .subscribe({
                        Timber.d("success init")
                    }, {
                        viewState.showError()
                    })
        }
        safeSubscribe {
            resListInteractor.getListItems()
                    .compose(ioToMainFlowableScheduler())
                    .subscribe({
                        listSize += it.size
                        if (listSize == 0) {
                            viewState.showEmpty()
                        } else {
                            viewState.displayItems(it)
                        }
                    }, {
                        viewState.showError()
                    })
        }
    }

    fun onCreateFolderClick(name: String) {
        safeSubscribe {
            resListInteractor.createNewFolder(name)
                    .compose(ioToMainSingleScheduler())
                    .subscribe({
                        listSize += 1
                        viewState.displayItems(arrayListOf(it))
                        viewState.showToast("Папка $name создана")
                    }, {
                        viewState.showToast("Ошибка при создании папки")
                    })

        }
    }

    fun onDeleteResClick(resource: ResItem) {
        safeSubscribe {
            resListInteractor.deleteResource(resource)
                    .compose(ioToMainCompletableScheduler())
                    .subscribe({
                        listSize -= 1
                        viewState.deleteResource(resource)
                        if (listSize == 0) {
                            viewState.showEmpty()
                            viewState.showToast(resource.name.toString() + " удален")
                        }
                    }, {
                        viewState.showToast(resource.name.toString() + " ошибка при удалении")
                    })
        }
    }
}