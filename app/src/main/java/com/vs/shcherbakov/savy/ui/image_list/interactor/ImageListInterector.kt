package com.vs.shcherbakov.savy.ui.image_list.interactor

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
import javax.inject.Inject

class ImageListInterector : BaseInteractor() {

    companion object {
        private const val LIMIT = 30
    }

    @Inject
    lateinit var prefsStorage: PrefStorage

    private var offset = 0
    private var imageSource: ReplayRelay<List<ResItem>> = ReplayRelay.create<List<ResItem>>()

    init {
        App.imageListComponent.inject(this)
    }

    fun getListItems(): Flowable<List<ResItem>> = imageSource.toFlowable(BackpressureStrategy.BUFFER)

    fun init(): Completable = Completable.fromAction({ initImageList() })


    private fun initImageList() {
        val credentials = Credentials("", prefsStorage.getUserToken())
        val client = OkHttpClientFactory.makeClient()
        do {
            val resList = mutableListOf<ResItem>()
            RestClient(credentials, client).getFlatResourceList(
                    ResourcesArgs.Builder()
                            .setSort(ResourcesArgs.Sort.modified)
                            .setLimit(LIMIT)
                            .setMediaType("image")
                            .setOffset(offset)
                            .setParsingHandler(object : ResourcesHandler() {
                                override fun handleItem(item: Resource?) {
                                    item?.let {
                                        resList.add(ResItem(it))
                                    }
                                }
                            })
                            .build())
            imageSource.accept(resList)
            offset += LIMIT
        } while (resList.size >= LIMIT)
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
