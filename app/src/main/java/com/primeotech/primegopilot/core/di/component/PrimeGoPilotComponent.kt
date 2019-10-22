package com.primeotech.primegopilot.core.di.component

import android.app.Application
import com.primeotech.primegopilot.core.base.PrimeGoPilotApplication
import com.primeotech.primegopilot.core.di.module.DatabaseModule
import com.primeotech.primegopilot.core.di.module.NetworkModule
import com.primeotech.primegopilot.core.di.module.PrimeGoPilotAppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [AndroidSupportInjectionModule::class,
               PrimeGoPilotAppModule::class,
                DatabaseModule::class,
                NetworkModule::class]
)

interface PrimeGoPilotComponent : AndroidInjector<PrimeGoPilotApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): PrimeGoPilotComponent
    }
}
