package com.primeotech.primegopilot.core.manager

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class PrimePilotSharedPreferences @Inject constructor(){

    var mSharedPreferences: SharedPreferences? = null
        @Inject set



    fun putString(key: String, value: String) {
        mSharedPreferences!!.edit().putString(key, value).apply()
    }


    fun putInt(key: String, value: Int) {
        mSharedPreferences!!.edit().putInt(key, value).apply()
    }

    fun putBoolean(key: String, value: Boolean) {
        mSharedPreferences!!.edit().putBoolean(key, value).apply()
    }

    fun getInt(key: String): Int {
        return mSharedPreferences!!.getInt(key, 0)
    }

    fun getString(key: String): String? {
        return mSharedPreferences!!.getString(key, null)
    }

    fun getBoolean(key: String): Boolean? {
        return mSharedPreferences!!.getBoolean(key, false)
    }

    fun clear() {
        mSharedPreferences!!.edit().clear().apply()
    }
}
