package com.vs.shcherbakov.savy.ui.base.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.arellomobile.mvp.MvpAppCompatActivity
import dagger.android.AndroidInjection

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun hideProgress() {
    }

    override fun showProgress() {
//        hideProgress()
//        progressDialog = CommonUtil.showLoadingDialog(this)
    }
}