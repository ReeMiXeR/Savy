package com.vs.shcherbakov.savy.ui.resource_list.interactor

import com.jakewharton.rxrelay2.ReplayRelay
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor
import com.yandex.disk.rest.*
import com.yandex.disk.rest.json.Resource
import io.reactivex.BackpressureStrategy
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import timber.log.Timber
import java.io.File
import java.util.logging.Logger
import javax.inject.Inject

class ResListInterector : BaseInteractor() {

    companion object {
        private const val LIMIT = 30
    }

    @Inject
    lateinit var prefsStorage: PrefStorage

    private var currentPath = ""
    private var offset = 0
    private var resSource: ReplayRelay<List<ResItem>> = ReplayRelay.create<List<ResItem>>()

    init {
        App.resourceListComponent.inject(this)
    }

    fun getListItems(): Flowable<List<ResItem>> = resSource.toFlowable(BackpressureStrategy.BUFFER)

    fun init(path: String): Completable = Completable.fromAction({ initResList(path) })


    private fun initResList(path: String) {
        currentPath = path
        val credentials = Credentials("", prefsStorage.getUserToken())
        val client = OkHttpClientFactory.makeClient()
        do {
            val resList = mutableListOf<ResItem>()
            RestClient(credentials, client).getResources(
                    ResourcesArgs.Builder()
                            .setPath(path)
                            .setSort(ResourcesArgs.Sort.modified)
                            .setLimit(LIMIT)
                            .setOffset(offset)
                            .setParsingHandler(object : ResourcesHandler() {
                                override fun handleItem(item: Resource?) {
                                    item?.let {
                                        resList.add(ResItem(it))
                                        Logger.getLogger(ResListInterector::class.java.name).warning(it.toString())
                                    }
                                }
                            })
                            .build())
            resSource.accept(resList)
            offset += LIMIT
        } while (resList.size >= LIMIT)
    }

    fun createNewFolder(name: String): Single<ResItem> {
        return Single.fromCallable({
            val credentials = Credentials("", prefsStorage.getUserToken())
            val client = OkHttpClientFactory.makeClient()
            RestClient(credentials, client)
                    .makeFolder(
                            if (currentPath.length == 1) currentPath + name
                            else "$currentPath/$name"
                    )

            ResItem(currentPath + name, name, 0, System.currentTimeMillis(), true, "", "", "", "")
        })
    }

    fun deleteResource(resource: ResItem): Completable {
        return Completable.fromAction({
            val credentials = Credentials("", prefsStorage.getUserToken())
            val client = OkHttpClientFactory.makeClient()
            RestClient(credentials, client)
                    .delete(resource.path, true)
        })
    }

    fun downloadResource(resource: ResItem): Single<File> {
        return Single.fromCallable({
            val credentials = Credentials("", prefsStorage.getUserToken())
            val client = OkHttpClientFactory.makeClient()
            val file = File("/storage/emulated/0/Download", File(resource.path).name)
            if (!file.exists()) {
                RestClient(credentials, client)
                        .downloadFile(resource.path, file, object : ProgressListener {
                            override fun updateProgress(loaded: Long, total: Long) {
                                Timber.e("Aasdasd")
                            }

                            override fun hasCancelled(): Boolean {
                                Timber.e("Aasdasd")
                                return false
                            }
                        })
            }
            file
        })
    }
}
