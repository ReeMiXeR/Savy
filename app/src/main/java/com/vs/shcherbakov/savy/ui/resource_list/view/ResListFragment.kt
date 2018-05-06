package com.vs.shcherbakov.savy.ui.resource_list.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.arellomobile.mvp.presenter.InjectPresenter
import com.vs.shcherbakov.savy.R
import com.vs.shcherbakov.savy.model.ResItem
import com.vs.shcherbakov.savy.ui.base.view.BaseFragment
import com.vs.shcherbakov.savy.ui.image.ImageActivity
import com.vs.shcherbakov.savy.ui.resource_list.presenter.ResListPresenter
import com.vs.shcherbakov.savy.ui.resource_list.view.adapter.ResourceListAdapter
import com.vs.shcherbakov.savy.utils.addFragmentToBackStack
import kotlinx.android.synthetic.main.fragment_items_list.*
import kotlinx.android.synthetic.main.fragment_items_list.view.*
import kotlinx.android.synthetic.main.toolbar.*
import java.io.File

class ResListFragment : BaseFragment(), ResourceListView, CreateFolderDialog.FolderDialog {

    companion object {
        private const val KEY_PATH = "path"
        private const val KEY_COLUMNS_COUNT = "columns_count"

        fun newInstance(path: String = "/", colCount: Int = 1): ResListFragment {
            val fragment = ResListFragment()

            fragment.arguments = Bundle().apply {
                putString(KEY_PATH, path)
                putInt(KEY_COLUMNS_COUNT, colCount)
            }

            return fragment
        }
    }

    @InjectPresenter
    internal lateinit var presenter: ResListPresenter

    private lateinit var adapter: ResourceListAdapter
    private var columnsCount = 1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_items_list, container, false)
        view.state_view.setStateView("empty", inflater.inflate(R.layout.empty_view, container, false))
        view.state_view.setStateView("offline", inflater.inflate(R.layout.error_view, container, false))
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        state_view.showProgress()

        arguments?.getString(KEY_PATH)?.let {
            presenter.loadListItems(it)
            toolbar_path.text = it
            if (it == "/") {
                toolbar_back.visibility = View.INVISIBLE
                toolbar_back.isClickable = false
            }
        }


        arguments?.getInt(KEY_COLUMNS_COUNT)?.let { columnsCount = it }

        adapter = ResourceListAdapter(
                { presenter.resolveResourceClick(it) },
                { presenter.onDeleteResClick(it) }
        )
        adapter.setHasStableIds(true)
        list.layoutManager = GridLayoutManager(context, columnsCount)
        list.adapter = adapter

        toolbar_columns.setOnClickListener {
            list.layoutManager =
                    if (columnsCount == 4) {
                        columnsCount = 1
                        adapter.columnsCount = columnsCount
                        GridLayoutManager(context, columnsCount)
                    } else {
                        columnsCount = 4
                        adapter.columnsCount = columnsCount
                        GridLayoutManager(context, columnsCount)
                    }
        }

        fab.setOnClickListener({
            val dialog = CreateFolderDialog.newInstance()
            dialog.setTargetFragment(this, 123)
            dialog.show(activity?.supportFragmentManager, CreateFolderDialog.TAG)
        })

        toolbar_back.setOnClickListener({ activity?.onBackPressed() })
    }

    override fun openFile(file: File, resource: ResItem) {
        if (resource.mediaType.equals("image")) {
            startActivity(Intent(activity, ImageActivity::class.java).apply {
                putExtra(ImageActivity.KEY_IMAGE, file.absolutePath)
            })
        } else {
            startActivity(Intent.createChooser(
                    Intent().apply {
                        action = Intent.ACTION_VIEW
                        setDataAndType(Uri.fromFile(file), resource.contentType)
                    },
                    "Открыть в...")
            )
        }
    }

    override fun displayItems(resList: List<ResItem>) {
        adapter.addItems(resList)
        state_view.showContent()
    }

    override fun deleteResource(res: ResItem) {
        adapter.deleteItem(res)
    }

    override fun openPath(path: String) {
        activity?.addFragmentToBackStack(R.id.container, newInstance(path, columnsCount), path)
    }

    override fun onCreateFolderClick(name: String) = presenter.onCreateFolderClick(name)

    override fun showLoading() = state_view.showProgress()

    override fun showEmpty() = state_view.showEmpty()

    override fun showError() = state_view.showOffline()

    override fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    override fun showDownloadProgress() {
        download_progress.visibility = View.VISIBLE
    }

    override fun hideDownloadProgress() {
        download_progress.visibility = View.GONE
    }
}