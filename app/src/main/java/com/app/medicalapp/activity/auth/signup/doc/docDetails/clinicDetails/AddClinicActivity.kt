package com.app.medicalapp.activity.auth.signup.doc.docDetails.clinicDetails

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import com.app.medicalapp.databinding.ActivityAddClinicBinding
import com.app.medicalapp.extentions.setDataBindingContentView
import kotlinx.android.synthetic.main.activity_add_clinic.*
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
        startActivityForResult(Intent(this, ClinicAddressActivity::class.java), 1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.save_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.save ->  {
//                val intent=Intent().also {
//                    it.putExtra("clinic",)
//                }

//                setResult()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            add_clinic.text =
                data?.getStringExtra(ClinicAddressActivity.STREET) + "," + data?.getStringExtra(
                    ClinicAddressActivity.AREA
                ) + "," + data?.getStringExtra(ClinicAddressActivity.CITY) + "," + data?.getStringExtra(
                    (ClinicAddressActivity.STATE)
                )
        }
    }
}
