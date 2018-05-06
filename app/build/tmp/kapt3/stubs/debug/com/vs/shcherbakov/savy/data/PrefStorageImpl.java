package com.vs.shcherbakov.savy.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vs/shcherbakov/savy/data/PrefStorageImpl;", "Lcom/vs/shcherbakov/savy/data/PrefStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "clearUserToken", "", "getLoginLink", "", "getUserToken", "updateUserToken", "token", "Companion", "app_debug"})
public final class PrefStorageImpl implements com.vs.shcherbakov.savy.data.PrefStorage {
    private final android.content.SharedPreferences prefs = null;
    private static final java.lang.String PREF_KEY_LOGIN_LINK = "pred_key_login_link";
    private static final java.lang.String PREF_FILE_NAME = "prefs_savy";
    private static final java.lang.String PREF_TOKEN = "pref_token";
    public static final com.vs.shcherbakov.savy.data.PrefStorageImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLoginLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUserToken() {
        return null;
    }
    
    @java.lang.Override()
    public void clearUserToken() {
    }
    
    @java.lang.Override()
    public void updateUserToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @javax.inject.Inject()
    public PrefStorageImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/vs/shcherbakov/savy/data/PrefStorageImpl$Companion;", "", "()V", "PREF_FILE_NAME", "", "PREF_KEY_LOGIN_LINK", "PREF_TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}