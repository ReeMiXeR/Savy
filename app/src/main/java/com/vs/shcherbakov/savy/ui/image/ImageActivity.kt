package com.vs.shcherbakov.savy.ui.image

import android.os.Bundle
import com.bumptech.glide.Glide
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.ui.base.view.BaseActivity
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity: BaseActivity() {

    companion object {
        const val KEY_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        Glide.with(this).load(intent.getStringExtra(KEY_IMAGE)).into(image)
    }
}