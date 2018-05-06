package com.vs.shcherbakov.savy.ui.image_list.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.model.ResItem

class ImageListAdapter(
        private val clickListener: (ResItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var columnsCount = 1
    private val items = mutableListOf<ResItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            ImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false))


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
            (holder as ImageViewHolder).bind(items[position], clickListener)

    fun addItems(resList: List<ResItem>) {
        val oldSize = items.size
        items.addAll(resList)
        notifyItemRangeInserted(oldSize, items.size)
    }

    override fun getItemViewType(position: Int): Int = columnsCount

    override fun getItemId(position: Int): Long {
        return items[position].hashCode().toLong()
    }
}