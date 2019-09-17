package com.app.medicalapp.activity.auth.signup.doc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.signup.diagostic.DiagnosticActivity
import com.app.medicalapp.activity.auth.signup.doc.docDetails.*
import com.app.medicalapp.activity.auth.signup.doc.docDetails.clinicDetails.AddClinicActivity
import com.app.medicalapp.databinding.ActivityDoctorSignupBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import kotlinx.android.synthetic.main.custom_toolbar.*

class DoctorSignUp : AppCompatActivity() {

    private lateinit var binding: ActivityDoctorSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setDataBindingContentView(R.layout.activity_doctor_signup)
        toolbar.title = "Medical App"
        setSupportActionBar(toolbar)
        binding.signup = this
    }

    fun addClinicDetails(view: View) {
        startActivity(Intent(this, AddClinicActivity::class.java))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun educationDetails(view: View) {
        startActivity((Intent(this, EducationDetailsActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun registrationDetails(view: View) {
        startActivity((Intent(this, RegistrationDetailsActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun specializationDetails(view: View) {
        startActivity(Intent(this, SpecializationDetailsActivity::class.java))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun experienceDetails(view: View) {
        startActivity((Intent(this, ExperienceDetailsActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun consultationFees(view: View) {
        startActivity((Intent(this, ConsultationFeesActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun bankDetails(view: View) {
        startActivity((Intent(this, BanksDetailsActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }

    fun nextButtonClick(view: View) {
        startActivity((Intent(this, DiagnosticActivity::class.java)))
        overridePendingTransition(R.anim.slide_up, R.anim.no_animation)
    }
}
