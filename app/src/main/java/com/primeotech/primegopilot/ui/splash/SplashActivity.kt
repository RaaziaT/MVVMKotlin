package com.primeotech.primegopilot.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.primeotech.primegopilot.R
import com.primeotech.primegopilot.core.base.BaseActivity
import com.primeotech.primegopilot.databinding.ActivitySplashBinding
import com.primeotech.primegopilot.ui.login.LoginActivity
import javax.inject.Inject

const val SPLASH_DISPLAY_LENGTH = 2500L;

class SplashActivity : BaseActivity<SplashViewModel>() {

    @Inject
    lateinit  var providerFactory: ViewModelProvider.Factory

    private lateinit var splashViewModel:SplashViewModel;

    lateinit var activitySplashBinding: ActivitySplashBinding;


    override fun getViewModel(): SplashViewModel {
        splashViewModel = ViewModelProviders.of(this,providerFactory).get(SplashViewModel::class.java)
        return splashViewModel
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySplashBinding = DataBindingUtil.setContentView(this,R.layout.activity_splash)

        activitySplashBinding.splashViewModel = splashViewModel
        activitySplashBinding.lifecycleOwner = this

        Handler().postDelayed({
            startActivity(Intent(this,LoginActivity::class.java))
        },SPLASH_DISPLAY_LENGTH)
    }
}
