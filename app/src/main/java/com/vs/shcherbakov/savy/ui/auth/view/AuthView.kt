package com.vs.shcherbakov.savy.ui.auth.view

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.vs.shcherbakov.savy.ui.base.view.BaseView

interface AuthView : BaseView {
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openAuthWebView()
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openMainActivity()
}