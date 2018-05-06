package com.vs.shcherbakov.savy.ui.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/base/presenter/BasePresenter;", "T", "Lcom/arellomobile/mvp/MvpView;", "Lcom/arellomobile/mvp/MvpPresenter;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "clear", "", "dispose", "onDestroy", "safeSubscribe", "action", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "app_debug"})
public class BasePresenter<T extends com.arellomobile.mvp.MvpView> extends com.arellomobile.mvp.MvpPresenter<T> {
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void dispose() {
    }
    
    public final void safeSubscribe(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends io.reactivex.disposables.Disposable> action) {
    }
    
    public final void clear() {
    }
    
    public BasePresenter() {
        super();
    }
}