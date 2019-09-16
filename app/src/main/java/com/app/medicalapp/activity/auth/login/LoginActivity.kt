package com.app.medicalapp.activity.auth.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.AuthListner
import com.app.medicalapp.databinding.ActivityLoginBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import com.app.medicalapp.utils.toast

class LoginActivity : AppCompatActivity(), AuthListner {

    private lateinit var viewModel: LoginViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind: ActivityLoginBinding =
            setDataBindingContentView(R.layout.activity_login)
        viewModel = ViewModelProviders.of(this).get(LoginViewmodel::class.java)
//        setContentView(R.layout.activity_login)
        bind.viewmodel = viewModel
        viewModel.authListner = this
    }

    override fun onStarted() {
    }

    override fun OnSuccess() {
    }

    override fun OnFailure(msg: String) {
        toast(msg)
    }
}
