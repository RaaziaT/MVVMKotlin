package com.primeotech.primegopilot.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.primeotech.primegopilot.core.data.realm.RealmCRUD
import com.primeotech.primegopilot.core.manager.PrimePilotSharedPreferences
import com.primeotech.primegopilot.core.manager.SharedPreferencesConstants
import javax.inject.Inject

class SplashViewModel @Inject
constructor(private val splashActivityRepository: SplashRepository,
            private var primePilotSharedPreferences: PrimePilotSharedPreferences, internal var realmCRUD: RealmCRUD) : ViewModel() {
    lateinit var checkIfUserExist: LiveData<Boolean>
    private val _checkIfUserExist = MutableLiveData<Boolean>()

    fun isFirstLaunch() {
        _checkIfUserExist.postValue(primePilotSharedPreferences.getBoolean(
            SharedPreferencesConstants.KEY_STATUS))
        checkIfUserExist = _checkIfUserExist
    }
}