package com.vs.shcherbakov.savy.ui.image_list.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0014J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;", "Lcom/vs/shcherbakov/savy/ui/base/presenter/BasePresenter;", "Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListView;", "()V", "imageListInteractor", "Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;", "getImageListInteractor", "()Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;", "setImageListInteractor", "(Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;)V", "listSize", "", "loadListItems", "", "onFirstViewAttach", "resolveResourceClick", "resource", "Lcom/vs/shcherbakov/savy/model/ResItem;", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ImageListPresenter extends com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter<com.vs.shcherbakov.savy.ui.image_list.view.ImageListView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector imageListInteractor;
    private int listSize;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector getImageListInteractor() {
        return null;
    }
    
    public final void setImageListInteractor(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector p0) {
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    private final void loadListItems() {
    }
    
    public final void resolveResourceClick(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
    }
    
    public ImageListPresenter() {
        super();
    }
}