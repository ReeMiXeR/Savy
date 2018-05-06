package com.vs.shcherbakov.savy.ui.resource_list.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u00061"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/view/ResListFragment;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseFragment;", "Lcom/vs/shcherbakov/savy/ui/resource_list/view/ResourceListView;", "Lcom/vs/shcherbakov/savy/ui/resource_list/view/CreateFolderDialog$FolderDialog;", "()V", "adapter", "Lcom/vs/shcherbakov/savy/ui/resource_list/view/adapter/ResourceListAdapter;", "columnsCount", "", "presenter", "Lcom/vs/shcherbakov/savy/ui/resource_list/presenter/ResListPresenter;", "getPresenter$app_debug", "()Lcom/vs/shcherbakov/savy/ui/resource_list/presenter/ResListPresenter;", "setPresenter$app_debug", "(Lcom/vs/shcherbakov/savy/ui/resource_list/presenter/ResListPresenter;)V", "deleteResource", "", "res", "Lcom/vs/shcherbakov/savy/model/ResItem;", "displayItems", "resList", "", "hideDownloadProgress", "onCreateFolderClick", "name", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openFile", "file", "Ljava/io/File;", "resource", "openPath", "path", "showDownloadProgress", "showEmpty", "showError", "showLoading", "showToast", "text", "Companion", "app_debug"})
public final class ResListFragment extends com.vs.shcherbakov.savy.ui.base.view.BaseFragment implements com.vs.shcherbakov.savy.ui.resource_list.view.ResourceListView, com.vs.shcherbakov.savy.ui.resource_list.view.CreateFolderDialog.FolderDialog {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter presenter;
    private com.vs.shcherbakov.savy.ui.resource_list.view.adapter.ResourceListAdapter adapter;
    private int columnsCount;
    private static final java.lang.String KEY_PATH = "path";
    private static final java.lang.String KEY_COLUMNS_COUNT = "columns_count";
    public static final com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter p0) {
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
    public void openFile(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem resource) {
    }
    
    @java.lang.Override()
    public void displayItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList) {
    }
    
    @java.lang.Override()
    public void deleteResource(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.model.ResItem res) {
    }
    
    @java.lang.Override()
    public void openPath(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @java.lang.Override()
    public void onCreateFolderClick(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
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
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void showDownloadProgress() {
    }
    
    @java.lang.Override()
    public void hideDownloadProgress() {
    }
    
    public ResListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/resource_list/view/ResListFragment$Companion;", "", "()V", "KEY_COLUMNS_COUNT", "", "KEY_PATH", "newInstance", "Lcom/vs/shcherbakov/savy/ui/resource_list/view/ResListFragment;", "path", "colCount", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String path, int colCount) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}