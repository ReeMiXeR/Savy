package com.vs.shcherbakov.savy.ui.image_list.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.data.PrefStorageImpl
import com.vs.shcherbakov.savy.model.ResItem
import kotlinx.android.synthetic.main.item_image.view.*

class ImageViewHolder(
        val view: View
) : RecyclerView.ViewHolder(view) {

    fun bind(resource: ResItem, onResourceClickListener: (ResItem) -> Unit) {
        view.requestLayout()
        view.setOnClickListener({ onResourceClickListener(resource) })

        if (resource.previewUrl != null) {
            Glide.with(view.context)
                    .load(GlideUrl(resource.previewUrl, LazyHeaders.Builder()
                            .addHeader("Authorization", "OAuth " + PrefStorageImpl(view.context).getUserToken())
                            .build()))
                    .centerCrop()
                    .placeholder(R.drawable.ic_image)
                    .into(view.image)
        } else {
            view.image.setImageResource(R.drawable.ic_image)
        }
    }
}