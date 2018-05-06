package com.vs.shcherbakov.savy.ui.resource_list.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0016\u001a\u00020\u0010J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector;", "Lcom/vs/shcherbakov/savy/ui/base/interactor/BaseInteractor;", "()V", "currentPath", "", "offset", "", "prefsStorage", "Lcom/vs/shcherbakov/savy/data/PrefStorage;", "getPrefsStorage", "()Lcom/vs/shcherbakov/savy/data/PrefStorage;", "setPrefsStorage", "(Lcom/vs/shcherbakov/savy/data/PrefStorage;)V", "resSource", "Lcom/jakewharton/rxrelay2/ReplayRelay;", "", "Lcom/vs/shcherbakov/savy/model/ResItem;", "createNewFolder", "Lio/reactivex/Single;", "name", "deleteResource", "Lio/reactivex/Completable;", "resource", "downloadResource", "Ljava/io/File;", "getListItems", "Lio/reactivex/Flowable;", "init", "path", "initResList", "", "Companion", "app_debug"})
public final class ResListInterector extends com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.data.PrefStorage prefsStorage;
    private java.lang.String currentPath;
    private int offset;
    private com.jakewharton.rxrelay2.ReplayRelay<java.util.List<com.vs.shcherbakov.savy.model.ResItem>> resSource;
    private static final int LIMIT = 15;
    public static final com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector.Companion Companion = null;
    
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
    public final io.reactivex.Completable init(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    private final void initResList(java.lang.String path) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.vs.shcherbakov.savy.model.ResItem> createNewFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteResource(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.io.File> downloadResource(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
        return null;
    }
    
    public ResListInterector() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector$Companion;", "", "()V", "LIMIT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}