package com.vs.shcherbakov.savy.ui.webview

import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.ui.webview.interactor.WebInteractor
import dagger.Module
import dagger.Provides

@Module
class WebModule {
    @Provides
    internal fun provideWebViewInteractor(prefStorage: PrefStorage): WebInteractor = WebInteractor(prefStorage)
}

