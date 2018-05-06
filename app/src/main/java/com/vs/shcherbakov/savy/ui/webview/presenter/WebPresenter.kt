package com.vs.shcherbakov.savy.ui.webview.presenter

import com.arellomobile.mvp.InjectViewState
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter
import com.vs.shcherbakov.savy.ui.webview.interactor.WebInteractor
import com.vs.shcherbakov.savy.ui.webview.view.WebView
import com.vs.shcherbakov.savy.utils.ioToMainSingleScheduler
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class WebPresenter : BasePresenter<WebView>() {

    @Inject
    lateinit var interactor: WebInteractor

    init {
        App.authComponent.inject(this)
    }

    override fun onFirstViewAttach() {
        viewState.loadAuthUrl()
    }

    fun resolveUrl(url: String) {
        safeSubscribe {
            interactor.resolveUrl(url)
                    .compose(ioToMainSingleScheduler())
                    .subscribe({
                        viewState.finishWebViewActivity(it)
                    },
                            {
                                Timber.e("Error")
                            })

        }
    }
}