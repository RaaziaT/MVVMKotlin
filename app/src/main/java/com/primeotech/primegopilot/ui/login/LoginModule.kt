package com.primeotech.primegopilot.ui.login

import androidx.lifecycle.ViewModelProvider
import com.primeotech.primegopilot.core.data.realm.RealmCRUD
import com.primeotech.primegopilot.core.manager.PrimePilotSharedPreferences
import com.primeotech.primegopilot.core.network.NetworkInterfaces
import com.primeotech.primegopilot.util.ViewModelProviderFactory
import dagger.Module
import dagger.Provides

@Module
class LoginModule {

    @Provides
    internal fun providesViewModel(splashActivityRepository: LoginRepository,
                                   primePilotSharedPreferences: PrimePilotSharedPreferences,
                                   realmCRUD: RealmCRUD
    ): LoginViewModel {
        return LoginViewModel(splashActivityRepository, primePilotSharedPreferences, realmCRUD)
    }

    @Provides
    internal fun provideRepository(networkInterfaces: NetworkInterfaces): LoginRepository {
        return LoginRepository(networkInterfaces)
    }

    @Provides
    internal fun provideViewModelProvider(viewModel: LoginViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(viewModel)
    }
}