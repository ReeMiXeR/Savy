package com.vs.shcherbakov.savy.ui.webview.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/webview/view/WebViewActivity;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseActivity;", "Lcom/vs/shcherbakov/savy/ui/webview/view/WebView;", "()V", "presenter", "Lcom/vs/shcherbakov/savy/ui/webview/presenter/WebPresenter;", "getPresenter$app_debug", "()Lcom/vs/shcherbakov/savy/ui/webview/presenter/WebPresenter;", "setPresenter$app_debug", "(Lcom/vs/shcherbakov/savy/ui/webview/presenter/WebPresenter;)V", "finishWebViewActivity", "", "token", "", "loadAuthUrl", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "MyWebViewClient", "app_debug"})
public final class WebViewActivity extends com.vs.shcherbakov.savy.ui.base.view.BaseActivity implements com.vs.shcherbakov.savy.ui.webview.view.WebView {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter presenter;
    private static final java.lang.String CLIENT_ID = "a1a2e179d9b5429380f9cd569436e2fa";
    private static final java.lang.String LOGIN_URL = "https://oauth.yandex.ru/authorize?response_type=token&client_id=a1a2e179d9b5429380f9cd569436e2fa";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BUNDLE_USER_TOKEN = "user_token";
    public static final com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void loadAuthUrl() {
    }
    
    @java.lang.Override()
    public void finishWebViewActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public WebViewActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/webview/view/WebViewActivity$MyWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/vs/shcherbakov/savy/ui/webview/view/WebViewActivity;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "app_debug"})
    final class MyWebViewClient extends android.webkit.WebViewClient {
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        public MyWebViewClient() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/webview/view/WebViewActivity$Companion;", "", "()V", "CLIENT_ID", "", "KEY_BUNDLE_USER_TOKEN", "LOGIN_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}