package com.vs.shcherbakov.savy.ui.base.view

import com.arellomobile.mvp.MvpView

interface BaseView : MvpView {

    fun showProgress()

    fun hideProgress()

}