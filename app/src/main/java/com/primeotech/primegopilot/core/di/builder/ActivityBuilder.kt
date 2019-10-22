package com.primeotech.primegopilot.core.di.builder

import com.primeotech.primegopilot.ui.login.LoginActivity
import com.primeotech.primegopilot.ui.login.LoginModule
import com.primeotech.primegopilot.ui.login.LoginViewModel
import com.primeotech.primegopilot.ui.splash.SplashActivity
import com.primeotech.primegopilot.ui.splash.SplashModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilder{
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun contributeSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun contributeLoginActivity(): LoginActivity
}