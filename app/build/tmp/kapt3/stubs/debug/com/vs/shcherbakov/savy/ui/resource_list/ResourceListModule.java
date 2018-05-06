package com.vs.shcherbakov.savy.ui.resource_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/ResourceListModule;", "", "()V", "provideResListInterector", "Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector;", "provideResListInterector$app_debug", "provideResListPresenter", "Lcom/vs/shcherbakov/savy/ui/resource_list/presenter/ResListPresenter;", "provideResListPresenter$app_debug", "app_debug"})
@dagger.Module()
public final class ResourceListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector provideResListInterector$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter provideResListPresenter$app_debug() {
        return null;
    }
    
    public ResourceListModule() {
        super();
    }
}