package com.vs.shcherbakov.savy.ui.resource_list.view.adapter.holders

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupWindow
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.data.PrefStorageImpl
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.utils.formatSize
import kotlinx.android.synthetic.main.item_resource_long.view.*
import kotlinx.android.synthetic.main.popup_more_actions.view.*

class ResourceLongViewHolder(
        val view: View
) : RecyclerView.ViewHolder(view) {
    private val moreButtons = view.more_button
    private val resourceName = view.name3
    private val dateModified = view.date_modified
    private val size = view.size
    private val image = view.resource_image3

    fun bind(resource: ResItem, onResourceClickListener: (ResItem) -> Unit, deleteClickListener: (ResItem) -> Unit) {
        moreButtons.setOnClickListener({
            val layout = (view.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.popup_more_actions, null)
            val popup = PopupWindow(view.context)
            layout.delete_action.setOnClickListener({ deleteClickListener(resource).also { popup.dismiss() } })
            popup.isTouchable = true
            popup.isFocusable = true
            popup.contentView = layout
            popup.showAsDropDown(it, it.width, 0)
        })

        view.setOnClickListener({ onResourceClickListener(resource) })
        resourceName.text = resource.name
        dateModified.text = resource.modified
        if (!resource.isDir) {
            size.text = formatSize(resource.contentLength)
        }


        when {
            resource.isDir -> {
                image.setImageResource(R.drawable.ic_folder)
            }

            resource.mediaType.equals("audio") -> {
                image.setImageResource(R.drawable.ic_mp3)
            }

            resource.mediaType.equals("image") -> {
                if (resource.previewUrl != null) {
                    Glide.with(view.context)
                            .load(GlideUrl(resource.previewUrl, LazyHeaders.Builder()
                                    .addHeader("Authorization", "OAuth " + PrefStorageImpl(view.context).getUserToken())
                                    .build()))
                            .asBitmap()
                            .centerCrop()
                            .placeholder(R.drawable.ic_image)
                            .dontAnimate()
                            .into(image)
                } else {
                    image.setImageResource(R.drawable.ic_image)
                }
            }

            resource.mediaType.equals("compressed") -> {
                image.setImageResource(R.drawable.ic_zip)
            }

            resource.mediaType.equals("video") -> {
                image.setImageResource(R.drawable.ic_video)
            }

            else -> {
                image.setImageResource(R.drawable.ic_unknown_file)
            }
        }
    }
}