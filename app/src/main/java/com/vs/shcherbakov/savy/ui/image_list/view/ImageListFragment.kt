package com.vs.shcherbakov.savy.ui.image_list.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.presenter.InjectPresenter
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.view.BaseFragment
import com.vs.shcherbakov.savy.ui.image.ImageActivity
import com.vs.shcherbakov.savy.ui.image_list.presenter.ImageListPresenter
import com.vs.shcherbakov.savy.ui.image_list.view.adapter.ImageListAdapter
import kotlinx.android.synthetic.main.fragment_items_list.*
import kotlinx.android.synthetic.main.fragment_items_list.view.*
import kotlinx.android.synthetic.main.toolbar.*

class ImageListFragment : BaseFragment(), ImageListView {

    companion object {
        fun newInstance(): ImageListFragment = ImageListFragment()
    }

    @InjectPresenter
    internal lateinit var presenter: ImageListPresenter

    private lateinit var adapter: ImageListAdapter
    private var columnsCount = 2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_items_list, container, false)
        view.state_view.setStateView("empty", inflater.inflate(R.layout.empty_view, container, false))
        view.state_view.setStateView("offline", inflater.inflate(R.layout.error_view, container, false))
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.visibility = View.GONE
        initToolbar()

        adapter = ImageListAdapter({ presenter.resolveResourceClick(it) })
        list.layoutManager = GridLayoutManager(context, columnsCount)
        list.adapter = adapter
        toolbar_columns.setOnClickListener {
            list.layoutManager =
                    when (columnsCount) {
                        4 -> {
                            columnsCount = 2
                            adapter.columnsCount = columnsCount
                            GridLayoutManager(context, columnsCount)
                        }
                        else -> {
                            columnsCount = 4
                            adapter.columnsCount = columnsCount
                            GridLayoutManager(context, columnsCount)
                        }
                    }
        }
    }

    override fun openImage(path: String) {
        startActivity(Intent(activity, ImageActivity::class.java).apply {
            putExtra(ImageActivity.KEY_IMAGE, path)
        })
    }

    override fun showDownloadProgress() {
        download_progress.visibility = View.VISIBLE
    }

    override fun hideDownloadProgress() {
        download_progress.visibility = View.GONE
    }

    override fun displayItems(resList: List<ResItem>) {
        state_view.showContent()
        adapter.addItems(resList)
    }

    override fun showLoading() = state_view.showProgress()

    override fun showEmpty() = state_view.showEmpty()

    override fun showError() = state_view.showOffline()

    private fun initToolbar() {
        toolbar_back.visibility = View.INVISIBLE
        toolbar_back.isClickable = false
        with(toolbar_path) {
            text = "Фото"
            textSize = 18f
        }
    }
}