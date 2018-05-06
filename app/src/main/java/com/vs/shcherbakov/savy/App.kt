package com.vs.shcherbakov.savy

import android.app.Application
import com.vs.shcherbakov.savy.di.AppComponent
import com.vs.shcherbakov.savy.di.AppModule
import com.vs.shcherbakov.savy.di.DaggerAppComponent
import com.vs.shcherbakov.savy.ui.auth.AuthComponent
import com.vs.shcherbakov.savy.ui.auth.AuthModule
import com.vs.shcherbakov.savy.ui.image_list.ImageListComponent
import com.vs.shcherbakov.savy.ui.image_list.ImageListModule
import com.vs.shcherbakov.savy.ui.resource_list.ResourceListComponent
import com.vs.shcherbakov.savy.ui.resource_list.ResourceListModule
import com.vs.shcherbakov.savy.ui.settings.SettingsComponent
import com.vs.shcherbakov.savy.ui.settings.SettingsModule
import com.vs.shcherbakov.savy.ui.webview.WebModule

class App : Application() {

    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
        @JvmStatic
        lateinit var authComponent: AuthComponent
        @JvmStatic
        lateinit var resourceListComponent: ResourceListComponent
        @JvmStatic
        lateinit var imageListComponent: ImageListComponent
        @JvmStatic
        lateinit var settingsComponent: SettingsComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .moduleContext(AppModule(this))
                .build()

        authComponent = appComponent
                .authBuilder()
                .authModule(AuthModule())
                .webModule(WebModule())
                .build()

        imageListComponent = appComponent
                .imageListBuilder()
                .imageListModule(ImageListModule())
                .build()

        resourceListComponent = appComponent
                .resourceListBuilder()
                .resourceListModule(ResourceListModule())
                .build()

        settingsComponent = appComponent
                .settingsBuilder()
                .settingstModule(SettingsModule())
                .build()

    }
}