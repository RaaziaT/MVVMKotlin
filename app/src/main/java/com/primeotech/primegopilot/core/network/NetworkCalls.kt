package com.primeotech.primegopilot.core.network

import android.content.Context
import android.net.ConnectivityManager
import javax.inject.Inject

class NetworkCalls @Inject constructor(context: Context, networkInterfaces: NetworkInterfaces) {

    val networkInterfaces = networkInterfaces
    val contextThis = context

    fun isNetworkConnected(): Boolean {
        val connectivityManager =
            contextThis.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

    fun signIn(){

    }


}