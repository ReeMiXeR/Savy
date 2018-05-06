package com.vs.shcherbakov.savy.ui.webview.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.arellomobile.mvp.presenter.InjectPresenter
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.ui.base.view.BaseActivity
import com.vs.shcherbakov.savy.ui.webview.presenter.WebPresenter
import kotlinx.android.synthetic.main.web_view.*


class WebViewActivity : BaseActivity(), com.vs.shcherbakov.savy.ui.webview.view.WebView {

    companion object {
        private const val CLIENT_ID: String = "a1a2e179d9b5429380f9cd569436e2fa"
        private const val LOGIN_URL: String = "https://oauth.yandex.ru/authorize?response_type=token&client_id=$CLIENT_ID"
        const val KEY_BUNDLE_USER_TOKEN = "user_token"
    }

    @InjectPresenter
    internal lateinit var presenter: WebPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_view)
        webView.webViewClient = MyWebViewClient()
    }


    private inner class MyWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            presenter.resolveUrl(url)
            view.loadUrl(url)
            return true
        }
    }

    override fun loadAuthUrl() = webView.loadUrl(LOGIN_URL)

    override fun finishWebViewActivity(token: String) {
        setResult(
                Activity.RESULT_OK,
                Intent().apply { putExtra(KEY_BUNDLE_USER_TOKEN, token) }
        )
        finish()
    }
}