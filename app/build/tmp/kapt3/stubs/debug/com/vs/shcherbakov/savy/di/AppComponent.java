package com.vs.shcherbakov.savy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/vs/shcherbakov/savy/di/AppComponent;", "", "authBuilder", "Lcom/vs/shcherbakov/savy/ui/auth/AuthComponent$Builder;", "imageListBuilder", "Lcom/vs/shcherbakov/savy/ui/image_list/ImageListComponent$Builder;", "resourceListBuilder", "Lcom/vs/shcherbakov/savy/ui/resource_list/ResourceListComponent$Builder;", "settingsBuilder", "Lcom/vs/shcherbakov/savy/ui/settings/SettingsComponent$Builder;", "Builder", "app_debug"})
@dagger.Component(modules = {com.vs.shcherbakov.savy.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vs.shcherbakov.savy.ui.auth.AuthComponent.Builder authBuilder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vs.shcherbakov.savy.ui.image_list.ImageListComponent.Builder imageListBuilder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vs.shcherbakov.savy.ui.resource_list.ResourceListComponent.Builder resourceListBuilder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vs.shcherbakov.savy.ui.settings.SettingsComponent.Builder settingsBuilder();
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vs/shcherbakov/savy/di/AppComponent$Builder;", "", "build", "Lcom/vs/shcherbakov/savy/di/AppComponent;", "moduleContext", "Lcom/vs/shcherbakov/savy/di/AppModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.di.AppComponent.Builder moduleContext(@org.jetbrains.annotations.NotNull()
        com.vs.shcherbakov.savy.di.AppModule moduleContext);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.di.AppComponent build();
    }
}