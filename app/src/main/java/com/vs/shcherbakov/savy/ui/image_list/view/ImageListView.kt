package com.vs.shcherbakov.savy.ui.image_list.view

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.view.BaseView

interface ImageListView : BaseView {

    @StateStrategyType(SingleStateStrategy::class)
    fun showLoading()

    @StateStrategyType(SingleStateStrategy::class)
    fun showEmpty()

    @StateStrategyType(SingleStateStrategy::class)
    fun showError()

    @StateStrategyType(SingleStateStrategy::class)
    fun displayItems(resList: List<ResItem>)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openImage(path: String)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showDownloadProgress()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun hideDownloadProgress()
}