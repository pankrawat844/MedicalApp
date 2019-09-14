package com.app.medicalapp.activity.auth.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.AuthListner
import com.app.medicalapp.databinding.ActivityLoginBinding
import com.app.medicalapp.utils.toast

class LoginActivity : AppCompatActivity(),AuthListner {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewmode:LoginViewmodel=ViewModelProviders.of(this).get(LoginViewmodel::class.java)
//        setContentView(R.layout.activity_login)
        bind.viewmodel=viewmode
        viewmode.authListner=this
    }


    override fun onStarted() {
    }

    override fun OnSuccess() {
    }

    override fun OnFailure(msg: String) {
        toast(msg)
    }
}
