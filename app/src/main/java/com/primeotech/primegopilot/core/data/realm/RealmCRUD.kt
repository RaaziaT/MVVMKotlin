package com.primeotech.primegopilot.core.data.realm

import io.realm.Realm
import javax.inject.Inject

class RealmCRUD @Inject constructor() {

    var realm: Realm? = null
        @Inject set

}