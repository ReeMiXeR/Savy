package com.vs.shcherbakov.savy.ui.base.presenter

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BasePresenter<T> : MvpPresenter<T>() where T : MvpView {
    private var compositeDisposable = CompositeDisposable()

    override fun onDestroy() {
        super.onDestroy()
        dispose()
    }

    fun dispose() {
        compositeDisposable.dispose()
        compositeDisposable = CompositeDisposable()
    }

    fun safeSubscribe(action: () -> Disposable) {
        compositeDisposable.add(action())
    }

    fun clear() {
        compositeDisposable.clear()
    }
}