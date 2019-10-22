package com.primeotech.primegopilot.core.di.module

import android.content.Context
import android.content.SharedPreferences
import com.primeotech.primegopilot.core.manager.SharedPreferencesConstants
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration

import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    internal fun provideRealm(context: Context): Realm {
        Realm.init(context)
        val builder = RealmConfiguration.Builder()
        builder.name("primeGoPilot.realm")

        val config = builder.build()
        return Realm.getInstance(config)
    }

    @Provides
    @Singleton
    internal fun providesSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(SharedPreferencesConstants.PRIME_PILOT_PREFERENCES, Context.MODE_PRIVATE)
    }
}