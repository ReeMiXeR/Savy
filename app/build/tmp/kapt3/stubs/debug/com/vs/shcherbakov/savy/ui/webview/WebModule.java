package com.vs.shcherbakov.savy.ui.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/webview/WebModule;", "", "()V", "provideWebViewInteractor", "Lcom/vs/shcherbakov/savy/ui/webview/interactor/WebInteractor;", "prefStorage", "Lcom/vs/shcherbakov/savy/data/PrefStorage;", "provideWebViewInteractor$app_debug", "app_debug"})
@dagger.Module()
public final class WebModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vs.shcherbakov.savy.ui.webview.interactor.WebInteractor provideWebViewInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.data.PrefStorage prefStorage) {
        return null;
    }
    
    public WebModule() {
        super();
    }
}