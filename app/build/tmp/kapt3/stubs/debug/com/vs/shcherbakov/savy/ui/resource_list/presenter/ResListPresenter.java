package com.vs.shcherbakov.savy.ui.resource_list.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/presenter/ResListPresenter;", "Lcom/vs/shcherbakov/savy/ui/base/presenter/BasePresenter;", "Lcom/vs/shcherbakov/savy/ui/resource_list/view/ResourceListView;", "()V", "listSize", "", "resListInteractor", "Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector;", "getResListInteractor", "()Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector;", "setResListInteractor", "(Lcom/vs/shcherbakov/savy/ui/resource_list/interactor/ResListInterector;)V", "loadListItems", "", "path", "", "onCreateFolderClick", "name", "onDeleteResClick", "resource", "Lcom/vs/shcherbakov/savy/model/ResItem;", "onFirstViewAttach", "resolveResourceClick", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ResListPresenter extends com.vs.shcherbakov.savy.ui.base.presenter.BasePresenter<com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector resListInteractor;
    private int listSize;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector getResListInteractor() {
        return null;
    }
    
    public final void setResListInteractor(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector p0) {
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void resolveResourceClick(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
    }
    
    public final void loadListItems(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public final void onCreateFolderClick(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onDeleteResClick(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
    }
    
    public ResListPresenter() {
        super();
    }
}