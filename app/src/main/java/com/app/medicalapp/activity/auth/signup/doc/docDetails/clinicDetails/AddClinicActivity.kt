package com.app.medicalapp.activity.auth.signup.doc.docDetails.clinicDetails

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import com.app.medicalapp.databinding.ActivityAddClinicBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import kotlinx.android.synthetic.main.custom_toolbar.*

class AddClinicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddClinicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setDataBindingContentView(R.layout.activity_add_clinic)
        toolbar.title = "Add Clinic"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.add = this

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    fun addAddress(view: View) {
        startActivity(Intent(this, ClinicAddressActivity::class.java))
    }
}
