package com.vs.shcherbakov.savy.ui.settings

import com.vs.shcherbakov.savy.ui.settings.interactor.SettingsInteractor
import com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter
import dagger.Subcomponent


@SettingsScope
@Subcomponent(modules = [(SettingsModule::class)])
interface SettingsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun settingstModule(module: SettingsModule): Builder
        fun build(): SettingsComponent
    }

    fun inject(item: SettingsPresenter)
    fun inject(item: SettingsInteractor)
}