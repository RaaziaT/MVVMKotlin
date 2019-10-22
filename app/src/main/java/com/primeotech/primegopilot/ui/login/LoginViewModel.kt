package com.primeotech.primegopilot.ui.login

import androidx.lifecycle.ViewModel
import com.primeotech.primegopilot.core.data.realm.RealmCRUD
import com.primeotech.primegopilot.core.manager.PrimePilotSharedPreferences
import javax.inject.Inject

class LoginViewModel @Inject
constructor(private val splashActivityRepository: LoginRepository,
            private var primePilotSharedPreferences: PrimePilotSharedPreferences, internal var realmCRUD: RealmCRUD) : ViewModel() {

}