package com.vs.shcherbakov.savy.ui.auth.presenter

import com.arellomobile.mvp.InjectViewState
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter
import com.vs.shcherbakov.savy.ui.auth.interactor.AuthInteractor
import com.vs.shcherbakov.savy.ui.auth.view.AuthView
import com.vs.shcherbakov.savy.utils.ioToMainCompletableScheduler
import com.vs.shcherbakov.savy.utils.ioToMainSingleScheduler
import javax.inject.Inject

@InjectViewState
class AuthtPresenter : BasePresenter<AuthView>() {

    @Inject
    lateinit var interactor: AuthInteractor

    init {
        App.authComponent.inject(this)
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        safeSubscribe {
            interactor.checkUserToken()
                    .compose(ioToMainSingleScheduler())
                    .subscribe({ token ->
                        if (token.isNotBlank()) viewState.openMainActivity()
                        else viewState.openAuthWebView()

                    }, {
                        viewState.openAuthWebView()
                    })
        }
    }

    fun resolveIntent(intent: String) {
        safeSubscribe {
            interactor.saveToken(intent)
                    .compose(ioToMainCompletableScheduler())
                    .subscribe({
                        viewState.openMainActivity()
                    },
                            {
                                viewState.openAuthWebView()
                            })

        }
    }
}