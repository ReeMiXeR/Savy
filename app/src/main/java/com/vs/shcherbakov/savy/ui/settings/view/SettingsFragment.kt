package com.vs.shcherbakov.savy.ui.settings.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.ui.auth.view.AuthActivity
import com.vs.shcherbakov.savy.ui.base.view.BaseFragment
import com.vs.shcherbakov.savy.ui.settings.presenter.SettingsPresenter
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.toolbar.*

class SettingsFragment : BaseFragment(), SettingsView {

    companion object {
        fun newInstance(): SettingsFragment = SettingsFragment()
    }

    @InjectPresenter
    internal lateinit var presenter: SettingsPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        exit_button.setOnClickListener({ presenter.onExitButtonClick() })
    }

    private fun initToolbar() {
        toolbar_back.visibility = View.GONE
        toolbar_columns.visibility = View.GONE
        with(toolbar_path) {
            text = "Настройки"
            textSize = 18f
        }
    }

    override fun finish() {
        activity?.let {
            startActivity(
                    Intent(activity, AuthActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK and Intent.FLAG_ACTIVITY_CLEAR_TASK
                    }
            )
            it.finish()
        }
    }
}