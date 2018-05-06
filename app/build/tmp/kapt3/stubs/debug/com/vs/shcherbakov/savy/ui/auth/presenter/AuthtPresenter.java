package com.vs.shcherbakov.savy.ui.auth.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/presenter/AuthtPresenter;", "Lcom/vs/shcherbakov/savy/ui/base/presenter/BasePresenter;", "Lcom/vs/shcherbakov/savy/ui/auth/view/AuthView;", "()V", "interactor", "Lcom/vs/shcherbakov/savy/ui/auth/interactor/AuthInteractor;", "getInteractor", "()Lcom/vs/shcherbakov/savy/ui/auth/interactor/AuthInteractor;", "setInteractor", "(Lcom/vs/shcherbakov/savy/ui/auth/interactor/AuthInteractor;)V", "onFirstViewAttach", "", "resolveIntent", "intent", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class AuthtPresenter extends com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter<com.vs.shcherbakov.savy.ui.auth.view.AuthView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.ui.auth.interactor.AuthInteractor interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.auth.interactor.AuthInteractor getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.auth.interactor.AuthInteractor p0) {
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void resolveIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String intent) {
    }
    
    public AuthtPresenter() {
        super();
    }
}