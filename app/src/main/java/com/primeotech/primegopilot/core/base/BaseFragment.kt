package com.primeotech.primegopilot.core.base

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import dagger.android.support.DaggerFragment


abstract class BaseFragment<T : ViewModel> : DaggerFragment() {

    private var viewModel: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.viewModel = if (viewModel == null) getViewModel() else viewModel
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        this.viewModel = if (viewModel == null) getViewModel() else viewModel
    }

    abstract fun getViewModel(): T

}
