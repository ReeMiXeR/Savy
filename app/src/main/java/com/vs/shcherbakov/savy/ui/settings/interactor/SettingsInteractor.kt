package com.vs.shcherbakov.savy.ui.settings.interactor

import com.vs.shcherbakov.savy.App
import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor
import io.reactivex.Completable
import javax.inject.Inject

class SettingsInteractor : BaseInteractor() {
    @Inject
    lateinit var prefsStorage: PrefStorage

    init {
        App.settingsComponent.inject(this)
    }

    fun performLogout(): Completable = Completable.fromAction({ prefsStorage.clearUserToken() })
}
