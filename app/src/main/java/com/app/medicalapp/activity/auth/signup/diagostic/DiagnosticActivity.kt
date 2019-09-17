package com.app.medicalapp.activity.auth.signup.diagostic

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.signup.diagostic.centerDetails.AddressActivity
import com.app.medicalapp.activity.auth.signup.diagostic.centerDetails.RegistrationDetailsActivity
import com.app.medicalapp.activity.auth.signup.diagostic.centerDetails.TypeOfLEActivity
import com.app.medicalapp.databinding.ActivityDiagnosticBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import kotlinx.android.synthetic.main.custom_toolbar.*

class DiagnosticActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiagnosticBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setDataBindingContentView(R.layout.activity_diagnostic)
        toolbar.title = "Diagnostic"
        setSupportActionBar(toolbar)
        binding.diag = this
    }

    fun typeOfLE(view: View) {
        startActivity(Intent(this, TypeOfLEActivity::class.java))
    }

    fun registrationDetails(view: View) {
        startActivity(Intent(this, RegistrationDetailsActivity::class.java))
    }

    fun address(view: View) {
        startActivity(Intent(this, AddressActivity::class.java))
    }

    fun branches(view: View) {
        Toast.makeText(this, "Optional", Toast.LENGTH_SHORT).show()
    }
}
