package com.vs.shcherbakov.savy.di

import android.content.Context
import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.data.PrefStorageImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {

    @Provides
    @Singleton
    fun context(): Context = context

    @Provides
    @Singleton
    internal fun providePrefStorage(): PrefStorage = PrefStorageImpl(context)
}