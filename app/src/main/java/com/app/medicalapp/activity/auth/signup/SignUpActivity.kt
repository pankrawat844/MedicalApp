package com.app.medicalapp.activity.auth.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.signup.doc.DoctorSignUp
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {
    private lateinit var adapter:ArrayAdapter<CharSequence>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        adapter=ArrayAdapter.createFromResource(this,R.array.category,R.layout.custom_spinner_item)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown)
        category.adapter=adapter
    }

    fun OnNextClick(view:View)
    {
        Intent(this,DoctorSignUp::class.java).also {
            startActivity(it)
        }
    }
}
