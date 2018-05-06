package com.vs.shcherbakov.savy.ui.auth.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/view/AuthActivity;", "Lcom/vs/shcherbakov/savy/ui/base/view/BaseActivity;", "Lcom/vs/shcherbakov/savy/ui/auth/view/AuthView;", "()V", "presenter", "Lcom/vs/shcherbakov/savy/ui/auth/presenter/AuthtPresenter;", "getPresenter$app_debug", "()Lcom/vs/shcherbakov/savy/ui/auth/presenter/AuthtPresenter;", "setPresenter$app_debug", "(Lcom/vs/shcherbakov/savy/ui/auth/presenter/AuthtPresenter;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openAuthWebView", "openMainActivity", "Companion", "app_debug"})
public final class AuthActivity extends com.vs.shcherbakov.savy.ui.base.view.BaseActivity implements com.vs.shcherbakov.savy.ui.auth.view.AuthView {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter presenter;
    private static final int REQUEST_CODE_WEB_VIEW = 1579;
    public static final com.vs.shcherbakov.savy.ui.auth.view.AuthActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void openAuthWebView() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void openMainActivity() {
    }
    
    public AuthActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/view/AuthActivity$Companion;", "", "()V", "REQUEST_CODE_WEB_VIEW", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}