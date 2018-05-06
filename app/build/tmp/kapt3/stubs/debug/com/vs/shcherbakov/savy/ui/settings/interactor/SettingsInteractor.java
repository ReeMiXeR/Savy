package com.vs.shcherbakov.savy.ui.settings.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/settings/interactor/SettingsInteractor;", "Lcom/vs/shcherbakov/savy/ui/base/interactor/BaseInteractor;", "()V", "prefsStorage", "Lcom/vs/shcherbakov/savy/data/PrefStorage;", "getPrefsStorage", "()Lcom/vs/shcherbakov/savy/data/PrefStorage;", "setPrefsStorage", "(Lcom/vs/shcherbakov/savy/data/PrefStorage;)V", "performLogout", "Lio/reactivex/Completable;", "app_debug"})
public final class SettingsInteractor extends com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.data.PrefStorage prefsStorage;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.data.PrefStorage getPrefsStorage() {
        return null;
    }
    
    public final void setPrefsStorage(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.data.PrefStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable performLogout() {
        return null;
    }
    
    public SettingsInteractor() {
        super();
    }
}