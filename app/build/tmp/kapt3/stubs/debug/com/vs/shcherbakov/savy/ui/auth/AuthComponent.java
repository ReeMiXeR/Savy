package com.vs.shcherbakov.savy.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/AuthComponent;", "", "inject", "", "item", "Lcom/vs/shcherbakov/savy/ui/auth/presenter/AuthtPresenter;", "Lcom/vs/shcherbakov/savy/ui/webview/presenter/WebPresenter;", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.vs.shcherbakov.savy.ui.auth.AuthModule.class, com.vs.shcherbakov.savy.ui.webview.WebModule.class})
@AuthScope()
public abstract interface AuthComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter item);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter item);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/auth/AuthComponent$Builder;", "", "authModule", "module", "Lcom/vs/shcherbakov/savy/ui/auth/AuthModule;", "build", "Lcom/vs/shcherbakov/savy/ui/auth/AuthComponent;", "webModule", "Lcom/vs/shcherbakov/savy/ui/webview/WebModule;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.auth.AuthComponent.Builder authModule(@org.jetbrains.annotations.NotNull()
        com.vs.shcherbakov.savy.ui.auth.AuthModule module);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.auth.AuthComponent.Builder webModule(@org.jetbrains.annotations.NotNull()
        com.vs.shcherbakov.savy.ui.webview.WebModule module);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.auth.AuthComponent build();
    }
}