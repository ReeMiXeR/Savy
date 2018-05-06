package com.vs.shcherbakov.savy.ui.resource_list

import com.vs.shcherbakov.savy.ui.resource_list.interactor.ResListInterector
import com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter
import dagger.Subcomponent


@ResourceListScope
@Subcomponent(modules = [(ResourceListModule::class)])
interface ResourceListComponent {

    @Subcomponent.Builder
    interface Builder {
        fun resourceListModule(module: ResourceListModule): Builder
        fun build(): ResourceListComponent
    }

    fun inject(item: ResListPresenter)
    fun inject(item: ResListInterector)
}