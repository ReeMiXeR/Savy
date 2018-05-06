package com.vs.shcherbakov.savy.ui.webview.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/webview/view/WebView;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseView;", "finishWebViewActivity", "", "token", "", "loadAuthUrl", "app_debug"})
public abstract interface WebView extends com.vs.shcherbakov.savy.ui.base.view.BaseView {
    
    public abstract void loadAuthUrl();
    
    public abstract void finishWebViewActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
}