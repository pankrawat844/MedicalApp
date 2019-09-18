package com.app.medicalapp.activity.auth.signup

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.medicalapp.R
import com.app.medicalapp.activity.auth.AuthListner
import com.app.medicalapp.activity.auth.signup.diagostic.DiagnosticActivity
import com.app.medicalapp.activity.auth.signup.doc.DoctorSignUp
import com.app.medicalapp.databinding.ActivitySignupBinding
import kotlinx.android.synthetic.main.activity_signup.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class SignUpActivity : AppCompatActivity(),AuthListner,KodeinAware {


    private lateinit var adapter:ArrayAdapter<CharSequence>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewmodel:ActivitySignupBinding=DataBindingUtil.setContentView(this,R.layout.activity_signup)
            val viewmodelprovier=ViewModelProviders.of(this,factory).get(SignupViewmodel::class.java)
        viewmodel.viewmodel=viewmodelprovier
        viewmodelprovier.authListner=this
        adapter=ArrayAdapter.createFromResource(this,R.array.category,R.layout.custom_spinner_item)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown)
        category.adapter=adapter
        viewmodelprovier.getUser().observe(this, Observer {
            if(it!=null) {
                if (it.name != null) {
                    if (it.category.equals("Doctors")) {
                        startActivity(Intent(this, DoctorSignUp::class.java))
                        finish()
                    }
                    if (it.category.equals("DIAGNOSTIC CENTER/LAB") or it.category.equals("BLOOD BANK")) {
                        startActivity(Intent(this, DiagnosticActivity::class.java))
                        finish()
                    }
                }
            }
        })
    }

    fun OnNextClick(view:View)
    {
        Intent(this,DoctorSignUp::class.java).also {
            startActivity(it)
        }
    }

    override fun OnSuccess(msg: String) {
//        if(msg.equals("Doctors")){
//            startActivity(Intent(this, DoctorSignUp::class.java))
//
//        }
//         if(msg.equals("DIAGNOSTIC CENTER/LAB") or msg.equals("BLOOD BANK") )
//         {
//             startActivity(Intent(this, DiagnosticActivity::class.java))
//
//         }

    }

    override val kodein by kodein()
    private val factory: SignupViewmodelFactory by instance()

    override fun onStarted() {

    }


    override fun OnFailure(msg: String) {
    }
}
