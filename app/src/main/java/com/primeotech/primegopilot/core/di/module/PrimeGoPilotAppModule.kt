package com.primeotech.primegopilot.core.di.module

import android.app.Application
import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson
import com.primeotech.primegopilot.core.base.PrimeGoPilotApplication
import com.primeotech.primegopilot.core.network.NetworkInterfaces
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
internal class PrimeGoPilotAppModule {

    @Singleton
    @Provides
    internal fun provideGlideInstance(
        application: Application,
        requestOptions: RequestOptions
    ): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

    @Singleton
    @Provides
    internal fun provideContext(
        application: PrimeGoPilotApplication):
            Context {
        return application
    }

    @Singleton
    @Provides
    internal fun provideGson(): Gson {
        return Gson()
    }

}