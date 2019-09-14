package com.app.medicalapp.activity.auth.login

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.app.medicalapp.activity.auth.signup.SignUpActivity

class LoginViewModel : ViewModel() {

    var name: String? = null
    var password: String? = null

    fun onCreateAccountClick(view: View) {
        val intent = Intent(view.context, SignUpActivity::class.java).also {
            view.context.startActivity(it)
        }
    }
}