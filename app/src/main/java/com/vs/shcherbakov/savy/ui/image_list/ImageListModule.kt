package com.vs.shcherbakov.savy.ui.image_list

import com.vs.shcherbakov.savy.ui.image_list.interactor.ImageListInterector
import com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter
import dagger.Module
import dagger.Provides

@Module
class ImageListModule {
    @Provides
    internal fun provideImageListInterector(): ImageListInterector = ImageListInterector()

    @Provides
    internal fun provideImageListPresenter(): ImageListPresenter = ImageListPresenter()
}