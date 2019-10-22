package com.primeotech.primegopilot.util

import com.primeotech.primegopilot.core.di.module.NetworkModule
import com.primeotech.primegopilot.core.network.NetworkInterfaces
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val BASE_URL=""
const val REQUEST_TIMEOUT = 10L

class ApiServiceBuilder {
    companion object {

        /**
         * Returns the retrofit service
         */

        fun getService(): NetworkInterfaces {
            val client =  OkHttpClient.Builder()
                .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build()

            return retrofit.create(NetworkInterfaces::class.java)
        }
    }
}