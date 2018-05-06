package com.vs.shcherbakov.savy.ui.image_list.presenter

import com.arellomobile.mvp.InjectViewState
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter
import com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector
import com.vs.shcherbakov.savy.ui.image_list.view.ImageListView
import com.vs.shcherbakov.savy.utils.ioToMainCompletableScheduler
import com.vs.shcherbakov.savy.utils.ioToMainFlowableScheduler
import com.vs.shcherbakov.savy.utils.ioToMainSingleScheduler
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class ImageListPresenter : BasePresenter<ImageListView>() {

    @Inject
    lateinit var imageListInteractor: ImageListInterector
    private var listSize = 0

    init {
        App.imageListComponent.inject(this)
    }

    override fun onFirstViewAttach() {
        loadListItems()
    }

    private fun loadListItems() {
        safeSubscribe {
            imageListInteractor.init()
                    .compose(ioToMainCompletableScheduler())
                    .subscribe({
                        Timber.d("success init")
                    }, {
                        viewState.showError()
                    })
        }
        safeSubscribe {
            imageListInteractor.getListItems()
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

    fun resolveResourceClick(resource: ResItem) {
        viewState.showDownloadProgress()
        safeSubscribe {
            imageListInteractor.downloadResource(resource)
                    .compose(ioToMainSingleScheduler())
                    .subscribe({
                        viewState.hideDownloadProgress()
                        viewState.openImage(it.absolutePath)
                    }, {
                        viewState.hideDownloadProgress()
                    })
        }
    }
}