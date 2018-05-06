package com.vs.shcherbakov.savy.ui.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/settings/SettingsComponent;", "", "inject", "", "item", "Lcom/vs/shcherbakov/savy/ui/settings/interactor/SettingsInteractor;", "Lcom/vs/shcherbakov/savy/ui/settings/presenter/SettingsPresenter;", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.vs.shcherbakov.savy.ui.settings.SettingsModule.class})
@SettingsScope()
public abstract interface SettingsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter item);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.vs.shcherbakov.savy.ui.settings.interactor.SettingsInteractor item);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/vs/shcherbakov/savy/ui/settings/SettingsComponent$Builder;", "", "build", "Lcom/vs/shcherbakov/savy/ui/settings/SettingsComponent;", "settingstModule", "module", "Lcom/vs/shcherbakov/savy/ui/settings/SettingsModule;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.settings.SettingsComponent.Builder settingstModule(@org.jetbrains.annotations.NotNull()
        com.vs.shcherbakov.savy.ui.settings.SettingsModule module);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.vs.shcherbakov.savy.ui.settings.SettingsComponent build();
    }
}