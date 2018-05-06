package com.vs.shcherbakov.savy.ui.resource_list.view

import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.view.BaseView
import java.io.File

interface ResourceListView : BaseView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openFile(file: File, resource: ResItem)

    @StateStrategyType(SingleStateStrategy::class)
    fun showLoading()

    @StateStrategyType(SingleStateStrategy::class)
    fun showEmpty()

    @StateStrategyType(SingleStateStrategy::class)
    fun showError()

    @StateStrategyType(SingleStateStrategy::class)
    fun displayItems(resList: List<ResItem>)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun openPath(path: String)

    @StateStrategyType(SingleStateStrategy::class)
    fun showToast(text: String)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun deleteResource(res: ResItem)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showDownloadProgress()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun hideDownloadProgress()
}