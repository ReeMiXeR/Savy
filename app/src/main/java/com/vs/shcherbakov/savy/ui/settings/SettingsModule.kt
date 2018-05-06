package com.vs.shcherbakov.savy.ui.settings

import com.vs.shcherbakov.savy.ui.settings.interactor.SettingsInteractor
import dagger.Module
import dagger.Provides

@Module
class SettingsModule {
    @Provides
    internal fun provideSettingsInterector(): SettingsInteractor = SettingsInteractor()
}