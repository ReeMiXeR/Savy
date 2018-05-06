package com.vs.shcherbakov.savy.data

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class PrefStorageImpl @Inject constructor(context: Context) : PrefStorage {

    companion object {
        private const val PREF_KEY_LOGIN_LINK = "pred_key_login_link"
        private const val PREF_FILE_NAME = "prefs_savy"
        private const val PREF_TOKEN = "pref_token"
    }

    private val prefs: SharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE)

    override fun getLoginLink(): String = prefs.getString(PREF_KEY_LOGIN_LINK, "")

    override fun getUserToken(): String = prefs.getString(PREF_TOKEN, "")

    override fun clearUserToken() = prefs.edit().remove(PREF_TOKEN).apply()

    override fun updateUserToken(token: String) = prefs.edit().putString(PREF_TOKEN, token).apply()
}