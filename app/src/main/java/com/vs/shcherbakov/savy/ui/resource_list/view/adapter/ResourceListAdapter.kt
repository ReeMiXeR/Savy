package com.vs.shcherbakov.savy.ui.resource_list.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.resource_list.view.adapter.holders.ResourceLongViewHolder
import com.vs.shcherbakov.savy.ui.resource_list.view.adapter.holders.ResourceSmallViewHolder

class ResourceListAdapter(
        private val clickListener: (ResItem) -> Unit,
        private val deleteClickListener: (ResItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var columnsCount = 1
    private val items = mutableListOf<ResItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            if (viewType == 1) ResourceLongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_resource_long, parent, false))
            else ResourceSmallViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_resource_small, parent, false))


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
            if (columnsCount == 1) {
                (holder as ResourceLongViewHolder).bind(items[position], clickListener, deleteClickListener)
            } else {
                (holder as ResourceSmallViewHolder).bind(items[position], clickListener, deleteClickListener)
            }

    fun addItems(resList: List<ResItem>) {
        val oldSize = items.size
        items.addAll(resList)
        notifyItemRangeInserted(oldSize, items.size)
    }

    fun deleteItem(res: ResItem) {
        val position = items.indexOf(res)
        items.removeAt(position)
        notifyItemRemoved(position)
    }

    override fun getItemViewType(position: Int): Int = columnsCount

    override fun getItemId(position: Int): Long {
        return items[position].hashCode().toLong()
    }
}
