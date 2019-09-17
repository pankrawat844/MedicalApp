package com.app.medicalapp.activity.auth.login

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.app.medicalapp.activity.auth.AuthListner
import com.app.medicalapp.activity.auth.signup.SignUpActivity

class LoginViewmodel : ViewModel() {


    var email: String? = null
    var password: String? = null
     var authListner:AuthListner?=null

    fun OnCreateAccountClick(view: View) {
        val intent = Intent(view.context, SignUpActivity::class.java).also {
            view.context.startActivity(it)
        }
    }

    fun OnclickLoginButton(view: View) {
        authListner?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
//            Toast.makeText(view.context,"Please",2).show()
            authListner?.OnFailure("Please Enter Email/Password or Password")
            return
        }
        authListner?.OnSuccess()


    }



}