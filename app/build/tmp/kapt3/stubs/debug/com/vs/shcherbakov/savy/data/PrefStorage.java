package com.vs.shcherbakov.savy.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/vs/shcherbakov/savy/data/PrefStorage;", "", "clearUserToken", "", "getLoginLink", "", "getUserToken", "updateUserToken", "token", "app_debug"})
public abstract interface PrefStorage {
    
    public abstract void updateUserToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUserToken();
    
    public abstract void clearUserToken();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLoginLink();
}