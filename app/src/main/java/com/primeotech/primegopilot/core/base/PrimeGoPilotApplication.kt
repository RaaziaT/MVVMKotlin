package com.primeotech.primegopilot.core.base

import com.primeotech.primegopilot.core.di.component.DaggerPrimeGoPilotComponent
import dagger.android.AndroidInjector

import dagger.android.DaggerApplication

class PrimeGoPilotApplication: DaggerApplication() {
    override fun applicationInjector():
            AndroidInjector<out DaggerApplication> {
        return DaggerPrimeGoPilotComponent.builder()
            .application(this).build()
    }
}