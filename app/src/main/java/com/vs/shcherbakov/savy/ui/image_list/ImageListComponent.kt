package com.vs.shcherbakov.savy.ui.image_list

import com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector
import com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter
import dagger.Subcomponent


@ImageListScope
@Subcomponent(modules = [(ImageListModule::class)])
interface ImageListComponent {

    @Subcomponent.Builder
    interface Builder {
        fun imageListModule(module: ImageListModule): Builder
        fun build(): ImageListComponent
    }

    fun inject(item: ImageListPresenter)
    fun inject(item: ImageListInterector)
}