package com.vs.shcherbakov.savy.di

import com.vs.shcherbakov.savy.ui.auth.AuthComponent
import com.vs.shcherbakov.savy.ui.image_list.ImageListComponent
import com.vs.shcherbakov.savy.ui.resource_list.ResourceListComponent
import com.vs.shcherbakov.savy.ui.settings.SettingsComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun moduleContext(moduleContext: AppModule): Builder

        fun build(): AppComponent
    }

    fun authBuilder(): AuthComponent.Builder
    fun imageListBuilder(): ImageListComponent.Builder
    fun resourceListBuilder(): ResourceListComponent.Builder

    fun settingsBuilder(): SettingsComponent.Builder
}