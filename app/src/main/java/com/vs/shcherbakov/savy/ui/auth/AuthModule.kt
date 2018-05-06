package com.vs.shcherbakov.savy.ui.auth

import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.ui.auth.interactor.AuthInteractor
import dagger.Module
import dagger.Provides

@Module
class AuthModule {
    @Provides
    internal fun provideStartInteractor(prefStorage: PrefStorage): AuthInteractor = AuthInteractor(prefStorage)
}

