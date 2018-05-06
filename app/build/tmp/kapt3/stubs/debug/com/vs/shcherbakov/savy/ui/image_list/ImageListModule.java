package com.vs.shcherbakov.savy.ui.image_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/ImageListModule;", "", "()V", "provideImageListInterector", "Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;", "provideImageListInterector$app_debug", "provideImageListPresenter", "Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;", "provideImageListPresenter$app_debug", "app_debug"})
@dagger.Module()
public final class ImageListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector provideImageListInterector$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter provideImageListPresenter$app_debug() {
        return null;
    }
    
    public ImageListModule() {
        super();
    }
}