package com.primeotech.primegopilot.ui.splash

import androidx.lifecycle.ViewModelProvider
import com.primeotech.primegopilot.core.data.realm.RealmCRUD
import com.primeotech.primegopilot.core.manager.PrimePilotSharedPreferences
import com.primeotech.primegopilot.core.network.NetworkInterfaces
import com.primeotech.primegopilot.util.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

@Module
class SplashModule {

    @Provides
    internal fun providesViewModel(splashActivityRepository: SplashRepository,
                                   primePilotSharedPreferences: PrimePilotSharedPreferences,
                                   realmCRUD: RealmCRUD
    ): SplashViewModel {
        return SplashViewModel(splashActivityRepository, primePilotSharedPreferences, realmCRUD)
    }

    @Provides
    internal fun provideRepository(networkInterfaces: NetworkInterfaces): SplashRepository {
        return SplashRepository(networkInterfaces)
    }

    @Provides
    internal fun provideViewModelProvider(viewModel: SplashViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(viewModel)
    }
}