package com.app.medicalapp.activity.auth.login

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.app.medicalapp.activity.auth.signup.SignupActivity

class LoginViewmodel:ViewModel()
{

    var name:String?=null
    var password:String?=null

    fun OnCreateAccountClick(view:View)
    {
        val intent=Intent(view.context,SignupActivity::class.java).also {
view.context.startActivity(it)
        }
    }
}