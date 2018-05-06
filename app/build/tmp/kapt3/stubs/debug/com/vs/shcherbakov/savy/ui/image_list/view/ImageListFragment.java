package com.vs.shcherbakov.savy.ui.image_list.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\'"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListFragment;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseFragment;", "Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListView;", "()V", "adapter", "Lcom/vs/shcherbakov/savy/ui/image_list/view/adapter/ImageListAdapter;", "columnsCount", "", "presenter", "Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;", "getPresenter$app_debug", "()Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;", "setPresenter$app_debug", "(Lcom/vs/shcherbakov/savy/ui/image_list/presenter/ImageListPresenter;)V", "displayItems", "", "resList", "", "Lcom/vs/shcherbakov/savy/model/ResItem;", "hideDownloadProgress", "initToolbar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openImage", "path", "", "showDownloadProgress", "showEmpty", "showError", "showLoading", "Companion", "app_debug"})
public final class ImageListFragment extends com.vs.shcherbakov.savy.ui.base.view.BaseFragment implements com.vs.shcherbakov.savy.ui.image_list.view.ImageListView {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter presenter;
    private com.vs.shcherbakov.savy.ui.image_list.view.adapter.ImageListAdapter adapter;
    private int columnsCount;
    public static final com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void openImage(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @java.lang.Override()
    public void showDownloadProgress() {
    }
    
    @java.lang.Override()
    public void hideDownloadProgress() {
    }
    
    @java.lang.Override()
    public void displayItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void showEmpty() {
    }
    
    @java.lang.Override()
    public void showError() {
    }
    
    private final void initToolbar() {
    }
    
    public ImageListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListFragment$Companion;", "", "()V", "newInstance", "Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}