package com.primeotech.primegopilot.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.primeotech.primegopilot.R
import com.primeotech.primegopilot.core.base.BaseActivity
import com.primeotech.primegopilot.databinding.ActivityLoginBinding
import javax.inject.Inject

class LoginActivity : BaseActivity<LoginViewModel>() {

    @Inject
    lateinit  var providerFactory: ViewModelProvider.Factory

    private lateinit var loginViewModel: LoginViewModel;

    lateinit var activity: ActivityLoginBinding;


    override fun getViewModel(): LoginViewModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = DataBindingUtil.setContentView(this,R.layout.activity_login)
        activity.lifecycleOwner = this
        activity.loginViewModel = loginViewModel
    }
}
