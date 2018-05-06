package com.vs.shcherbakov.savy.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\b\u0010\f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\r0\rH\u0002\u001a\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0018\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u0016\"\u0004\b\u0000\u0010\u0014\u001a\u0018\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u0018\"\u0004\b\u0000\u0010\u0014\u001a\u0018\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u001a\"\u0004\b\u0000\u0010\u0014\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a8\u0010\u001c\u001a\u00020\u0001*\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u00a8\u0006\u001e"}, d2 = {"addFragment", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "containerViewId", "", "fragment", "Landroid/support/v4/app/Fragment;", "tag", "", "executeNow", "", "getIOThreadScheduler", "Lio/reactivex/Scheduler;", "getMainThreadScheduler", "kotlin.jvm.PlatformType", "ioToMainCompletableScheduler", "Lio/reactivex/CompletableTransformer;", "ioToMainFlowableScheduler", "Lio/reactivex/FlowableTransformer;", "T", "ioToMainMaybeScheduler", "Lio/reactivex/MaybeTransformer;", "ioToMainObservableScheduler", "Lio/reactivex/ObservableTransformer;", "ioToMainSingleScheduler", "Lio/reactivex/SingleTransformer;", "Landroid/support/v4/app/FragmentActivity;", "addFragmentToBackStack", "addToBackStack", "app_debug"})
public final class ExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> ioToMainObservableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.SingleTransformer<T, T> ioToMainSingleScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.CompletableTransformer ioToMainCompletableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.FlowableTransformer<T, T> ioToMainFlowableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.MaybeTransformer<T, T> ioToMainMaybeScheduler() {
        return null;
    }
    
    private static final io.reactivex.Scheduler getIOThreadScheduler() {
        return null;
    }
    
    private static final io.reactivex.Scheduler getMainThreadScheduler() {
        return null;
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fragmentManager, @android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean executeNow) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentActivity $receiver, @android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean executeNow) {
    }
    
    public static final void addFragmentToBackStack(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentActivity $receiver, @android.support.annotation.IdRes()
    int containerViewId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, boolean executeNow, boolean addToBackStack) {
    }
}