package com.vs.shcherbakov.savy.ui.main.view

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.ui.base.view.BaseActivity
import com.vs.shcherbakov.savy.ui.image_list.view.ImageListFragment
import com.vs.shcherbakov.savy.ui.resource_list.view.ResListFragment
import com.vs.shcherbakov.savy.ui.settings.view.SettingsFragment
import com.vs.shcherbakov.savy.utils.addFragmentToBackStack
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        addFragmentToBackStack(R.id.container, ImageListFragment.newInstance(), "")
        bottom_navigation.setOnNavigationItemSelectedListener(
                {
                    when (it.itemId) {
                        R.id.list -> {
                            addFragmentToBackStack(R.id.container, ResListFragment.newInstance(), "/")
                        }
                        
                        R.id.photo_list -> {
                            addFragmentToBackStack(R.id.container, ImageListFragment.newInstance(), "")
                        }

                        R.id.settings -> {
                            addFragmentToBackStack(R.id.container, SettingsFragment.newInstance(), "settings")
                        }
                    }
                    true
                })
        setupPermissions()
    }

    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)

        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest()
        }
    }

    private fun makeRequest() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 333)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1)
            supportFragmentManager.popBackStackImmediate()
        else finish()
    }
}