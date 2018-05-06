package com.vs.shcherbakov.savy.ui.image_list.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0006J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;", "Lcom/vs/shcherbakov/savy/ui/base/interactor/BaseInteractor;", "()V", "imageSource", "Lcom/jakewharton/rxrelay2/ReplayRelay;", "", "Lcom/vs/shcherbakov/savy/model/ResItem;", "offset", "", "prefsStorage", "Lcom/vs/shcherbakov/savy/data/PrefStorage;", "getPrefsStorage", "()Lcom/vs/shcherbakov/savy/data/PrefStorage;", "setPrefsStorage", "(Lcom/vs/shcherbakov/savy/data/PrefStorage;)V", "downloadResource", "Lio/reactivex/Single;", "Ljava/io/File;", "resource", "getListItems", "Lio/reactivex/Flowable;", "init", "Lio/reactivex/Completable;", "initImageList", "", "Companion", "app_debug"})
public final class ImageListInterector extends com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.data.PrefStorage prefsStorage;
    private int offset;
    private com.jakewharton.rxrelay2.ReplayRelay<java.util.List<com.vs.shcherbakov.savy.model.ResItem>> imageSource;
    private static final int LIMIT = 15;
    public static final com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.data.PrefStorage getPrefsStorage() {
        return null;
    }
    
    public final void setPrefsStorage(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.data.PrefStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.vs.shcherbakov.savy.model.ResItem>> getListItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable init() {
        return null;
    }
    
    private final void initImageList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.io.File> downloadResource(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
        return null;
    }
    
    public ImageListInterector() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector$Companion;", "", "()V", "LIMIT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}