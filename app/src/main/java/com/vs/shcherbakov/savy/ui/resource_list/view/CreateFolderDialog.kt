package com.vs.shcherbakov.savy.ui.resource_list.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatDialogFragment
import com.vs.shcherbakov.savy.R
import kotlinx.android.synthetic.main.dialog_fragment_create_folder.*

class CreateFolderDialog : MvpAppCompatDialogFragment() {

    companion object {

        const val TAG = "CreateFolderDialog"

        fun newInstance(): CreateFolderDialog = CreateFolderDialog()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_fragment_create_folder, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        create_button.setOnClickListener({
            with(folder_name.text.toString()) {
                if (isNotBlank()) {
                    (targetFragment as FolderDialog).onCreateFolderClick(this)
                    dismiss()
                } else {
                    Toast.makeText(context, "Название неправильное", Toast.LENGTH_SHORT).show()
                }
            }
        })

        cancel_button.setOnClickListener({
            dismiss()
        })
    }

    interface FolderDialog {
        fun onCreateFolderClick(name: String)
    }
}