package com.app.medicalapp.activity.auth.signup.doc.docDetails.clinicDetails

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.app.medicalapp.R
import kotlinx.android.synthetic.main.activity_clinic_address.*
import kotlinx.android.synthetic.main.custom_toolbar.*

class ClinicAddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_address)
        toolbar.title = "Clinic Address"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    companion object {
        val STATE: String = "state"
        val CITY: String = "city"
        val AREA: String = "area"
        val STREET: String = "street"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.save_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.save ->  {
                val intent: Intent = Intent()
                intent.putExtra(STATE, state.text.toString())
                intent.putExtra(CITY, city.text.toString())
                intent.putExtra(AREA, area.text.toString())
                intent.putExtra(STREET, street.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}
