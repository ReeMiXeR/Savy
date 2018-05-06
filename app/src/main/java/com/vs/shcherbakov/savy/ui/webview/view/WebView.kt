package com.vs.shcherbakov.savy.ui.webview.view

import com.vs.shcherbakov.savy.ui.base.view.BaseView

interface WebView :BaseView {
    fun loadAuthUrl()
    fun finishWebViewActivity(token: String)
}