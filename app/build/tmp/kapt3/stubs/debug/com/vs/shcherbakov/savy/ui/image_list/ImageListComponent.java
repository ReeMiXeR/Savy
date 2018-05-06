package com.vs.shcherbakov.savy.ui.image_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/ImageListComponent;", "", "inject", "", "item", "Lcom/vs/shcherbakov/savy/ui/image_list/interactor/ImageListInterector;", "Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.vs.shcherbakov.savy.ui.image_list.ImageListModule.class})
@ImageListScope()
public abstract interface ImageListComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter item);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector item);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/ImageListComponent$Builder;", "", "build", "Lcom/vs/shcherbakov/savy/ui/image_list/ImageListComponent;", "imageListModule", "module", "Lcom/vs/shcherbakov/savy/ui/image_list/ImageListModule;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.image_list.ImageListComponent.Builder imageListModule(@org.jetbrains.annotations.NotNull()
        com.vs.shcherbakov.savy.ui.image_list.ImageListModule module);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.image_list.ImageListComponent build();
    }
}