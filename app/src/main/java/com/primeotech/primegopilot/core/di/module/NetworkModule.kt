package com.primeotech.primegopilot.core.di.module

import com.primeotech.primegopilot.core.network.NetworkInterfaces
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    internal fun providesClient(): OkHttpClient {
        okHttpClient = OkHttpClient.Builder()
            .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .build()

        return okHttpClient as OkHttpClient
    }

    @Singleton
    @Provides
    internal fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(providesClient())
            .build()
    }

    @Singleton
    @Provides
    internal fun provideApiService(retrofit: Retrofit): NetworkInterfaces {
        return retrofit.create(NetworkInterfaces::class.java)
    }

    companion object {

        private const val REQUEST_TIMEOUT = 10L
        private var okHttpClient: OkHttpClient? = null
        private const val BASE_URL= ""
    }
}