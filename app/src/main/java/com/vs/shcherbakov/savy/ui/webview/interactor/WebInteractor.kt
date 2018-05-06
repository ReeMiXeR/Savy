package com.vs.shcherbakov.savy.ui.webview.interactor

import android.content.res.Resources
import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor
import io.reactivex.Single
import java.util.regex.Pattern

class WebInteractor(private val prefStorage: PrefStorage) : BaseInteractor() {

    fun resolveUrl(data: String): Single<String> = Single.fromCallable({
        val pattern = Pattern.compile("access_token=(.*?)(&|$)")
        with(pattern.matcher(data)) {
            if (find() && group(1).isNotBlank()) {
                prefStorage.updateUserToken(group(1))
                group(1)
            } else {
                throw Resources.NotFoundException()
            }
        }
    })
}