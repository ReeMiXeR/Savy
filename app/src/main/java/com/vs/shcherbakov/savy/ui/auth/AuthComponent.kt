package com.vs.shcherbakov.savy.ui.auth

import com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter
import com.vs.shcherbakov.savy.ui.webview.WebModule
import com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter
import dagger.Subcomponent


@AuthScope
@Subcomponent(modules = [(AuthModule::class), (WebModule::class)])
interface AuthComponent {

    @Subcomponent.Builder
    interface Builder {
        fun authModule(module: AuthModule): Builder
        fun webModule(module: WebModule): Builder
        fun build(): AuthComponent
    }

    fun inject(item: AuthtPresenter)
    fun inject(item: WebPresenter)
}