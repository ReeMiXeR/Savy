package com.vs.shcherbakov.savy.ui.auth.interactor

import com.vs.shcherbakov.savy.data.PrefStorage
import com.vs.shcherbakov.savy.ui.base.interactor.BaseInteractor
import io.reactivex.Completable
import io.reactivex.Single

class AuthInteractor(private val prefStorage: PrefStorage) : BaseInteractor() {

    fun checkUserToken(): Single<String> = Single.fromCallable({ prefStorage.getUserToken() })

    fun saveToken(token: String): Completable = Completable.fromAction({ prefStorage.updateUserToken(token) })
}