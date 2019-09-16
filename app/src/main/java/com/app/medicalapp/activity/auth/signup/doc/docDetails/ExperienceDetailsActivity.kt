package com.app.medicalapp.activity.auth.signup.doc.docDetails

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import com.app.medicalapp.databinding.ActivityExperienceDetailsBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import kotlinx.android.synthetic.main.custom_toolbar.*
import java.text.SimpleDateFormat
import java.util.*

class ExperienceDetailsActivity : AppCompatActivity() {

    private var format = SimpleDateFormat("dd MMM, YYYY", Locale.UK)
    private lateinit var binding: ActivityExperienceDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setDataBindingContentView(R.layout.activity_experience_details)
        toolbar.title = "Experience"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.expr = this

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    fun datePicker(view: View) {
        val calendar = Calendar.getInstance()
        val datePicker = DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                val setDate = Calendar.getInstance()
                setDate.set(Calendar.YEAR, year)
                setDate.set(Calendar.MONTH, month)
                setDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val date = format.format(setDate.time)

                Toast.makeText(this, date, Toast.LENGTH_SHORT).show()
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePicker.show()
    }
}
