package com.app.medicalapp.activity.auth.signup.diagostic.centerDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import kotlinx.android.synthetic.main.custom_toolbar.*

class RegistrationDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_details2)
        toolbar.title = "Registration"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}
