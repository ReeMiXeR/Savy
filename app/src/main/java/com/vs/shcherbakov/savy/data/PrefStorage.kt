package com.vs.shcherbakov.savy.data

interface PrefStorage {
    fun updateUserToken(token: String)
    fun getUserToken(): String
    fun clearUserToken()
    fun getLoginLink(): String
}