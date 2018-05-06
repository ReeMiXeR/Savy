package com.vs.shcherbakov.savy.utils

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

fun <T> ioToMainObservableScheduler(): ObservableTransformer<T, T> = ObservableTransformer { upstream ->
    upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
}

fun <T> ioToMainSingleScheduler(): SingleTransformer<T, T> = SingleTransformer { upstream ->
    upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
}


fun ioToMainCompletableScheduler(): CompletableTransformer = CompletableTransformer { upstream ->
    upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
}


fun <T> ioToMainFlowableScheduler(): FlowableTransformer<T, T> = FlowableTransformer { upstream ->
    upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
}


fun <T> ioToMainMaybeScheduler(): MaybeTransformer<T, T> = MaybeTransformer { upstream ->
    upstream.subscribeOn(getIOThreadScheduler())
            .observeOn(getMainThreadScheduler())
}


private fun getIOThreadScheduler() = Schedulers.io()

private fun getMainThreadScheduler() = AndroidSchedulers.mainThread()

fun addFragment(fragmentManager: FragmentManager, @IdRes containerViewId: Int, fragment: Fragment, tag: String, executeNow: Boolean = true) {
    with(fragmentManager) {
        beginTransaction().add(containerViewId, fragment, tag).commit()
        if (executeNow) executePendingTransactions()
    }
}

fun FragmentActivity.addFragment(@IdRes containerViewId: Int, fragment: Fragment, tag: String, executeNow: Boolean = true) {
    addFragment(this.supportFragmentManager, containerViewId, fragment, tag, executeNow)
}

fun FragmentActivity.addFragmentToBackStack(@IdRes containerViewId: Int, fragment: Fragment, tag: String, executeNow: Boolean = true, addToBackStack: Boolean = true) {
    with(this.supportFragmentManager) {
        beginTransaction().replace(containerViewId, fragment, tag)
                .apply { if (addToBackStack) addToBackStack(tag) }
                .commit()
        if (executeNow) executePendingTransactions()
    }
}