package com.vs.shcherbakov.savy.ui.settings.presenter

import com.arellomobile.mvp.InjectViewState
import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter
import com.vs.shcherbakov.savy.ui.settings.interactor.SettingsInteractor
import com.vs.shcherbakov.savy.ui.settings.view.SettingsView
import com.vs.shcherbakov.savy.utils.ioToMainCompletableScheduler
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class SettingsPresenter : BasePresenter<SettingsView>() {

    @Inject
    lateinit var settingsInteractor: SettingsInteractor

    init {
        App.settingsComponent.inject(this)
    }

    override fun onFirstViewAttach() {
    }

    fun onExitButtonClick() {
        safeSubscribe{
            settingsInteractor.performLogout()
                    .compose(ioToMainCompletableScheduler())
                    .subscribe({
                        viewState.finish()
                    }, {
                        Timber.d("Error")
                    })
        }
    }
}