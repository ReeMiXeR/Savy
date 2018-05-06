package com.vs.shcherbakov.savy.ui.image_list.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\u0003H\'J\b\u0010\f\u001a\u00020\u0003H\'J\b\u0010\r\u001a\u00020\u0003H\'J\b\u0010\u000e\u001a\u00020\u0003H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/image_list/view/ImageListView;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseView;", "displayItems", "", "resList", "", "Lcom/vs/shcherbakov/savy/model/ResItem;", "hideDownloadProgress", "openImage", "path", "", "showDownloadProgress", "showEmpty", "showError", "showLoading", "app_debug"})
public abstract interface ImageListView extends com.vs.shcherbakov.savy.ui.base.view.BaseView {
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class)
    public abstract void showLoading();
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class)
    public abstract void showEmpty();
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class)
    public abstract void showError();
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy.class)
    public abstract void displayItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vs.shcherbakov.savy.model.ResItem> resList);
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void openImage(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void showDownloadProgress();
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void hideDownloadProgress();
}