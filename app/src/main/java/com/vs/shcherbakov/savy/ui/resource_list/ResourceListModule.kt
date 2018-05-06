package com.vs.shcherbakov.savy.ui.resource_list

import com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector
import com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter
import dagger.Module
import dagger.Provides

@Module
class ResourceListModule {
    @Provides
    internal fun provideResListInterector(): ResListInterector = ResListInterector()

    @Provides
    internal fun provideResListPresenter(): ResListPresenter = ResListPresenter()
}