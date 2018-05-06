package com.vs.shcherbakov.savy.ui.auth.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/view/AuthView;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseView;", "openAuthWebView", "", "openMainActivity", "app_debug"})
public abstract interface AuthView extends com.vs.shcherbakov.savy.ui.base.view.BaseView {
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void openAuthWebView();
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void openMainActivity();
}