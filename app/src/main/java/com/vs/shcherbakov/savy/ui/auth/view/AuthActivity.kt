package com.vs.shcherbakov.savy.ui.auth.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.arellomobile.mvp.presenter.InjectPresenter
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.ui.auth.presenter.AuthtPresenter
import com.vs.shcherbakov.savy.ui.base.view.BaseActivity
import com.vs.shcherbakov.savy.ui.main.view.MainActivity
import com.vs.shcherbakov.savy.ui.webview.view.WebViewActivity

class AuthActivity : BaseActivity(), AuthView {

    companion object {
        private const val REQUEST_CODE_WEB_VIEW = 1579
    }

    @InjectPresenter
    internal lateinit var presenter: AuthtPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_activity)
    }

    override fun openAuthWebView() =
            with(AlertDialog.Builder(this)) {
                setTitle("Авторизация")
                setMessage("Открыть браузер для авторизации в Яндекс.Диск?")
                setPositiveButton("Да") { _, _ ->
                    startActivityForResult(Intent(this@AuthActivity, WebViewActivity::class.java), REQUEST_CODE_WEB_VIEW)
                }
                setNegativeButton("Нет") { dialog, which ->
                    Toast.makeText(this@AuthActivity, "Вы не согласны(", Toast.LENGTH_SHORT).show()
                }
                create().show()
            }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE_WEB_VIEW && resultCode == Activity.RESULT_OK) {
            data?.let { presenter.resolveIntent(it.getStringExtra(WebViewActivity.KEY_BUNDLE_USER_TOKEN)) }
        }
    }

    override fun openMainActivity() {
        startActivity(
                Intent(this, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK and Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
        )
        finish()
    }
}