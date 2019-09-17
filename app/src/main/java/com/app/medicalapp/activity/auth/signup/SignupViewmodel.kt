package com.app.medicalapp.activity.auth.signup

import android.content.Context
import android.content.SharedPreferences
import android.view.View
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.app.medicalapp.activity.auth.AuthListner
import com.app.medicalapp.room.AppDatabase
import com.app.medicalapp.room.entities.Doctor
import com.app.medicalapp.utils.Coroutines
import android.widget.AdapterView
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.lifecycle.MutableLiveData


class SignupViewmodel(
    private val db:AppDatabase

) :ViewModel() {

    var name:String?=null
    var category:String?="abv"
    var mobile:String?=null
    var email:String?=null
    var password:String?=null
    var authListner:AuthListner?=null
    var arrlist:ArrayList<String>?=ArrayList<String>()
    init {

             arrlist?.addAll(listOf("Doctor","DIAGNOSTIC CENTER/LAB","BLOOD BANK","PHARMACY"))

    }
//    var list: MutableList<String> = mutableListOf<String>()

    val categoryIdItemPosition = MutableLiveData<Int>()
    fun getUser()=db.getDoctorDetail().getDoctorDetail()
    fun onNextButtonClick(view:View)
    {
        if(name.isNullOrEmpty())
        {
            Toast.makeText(view.context,"Name must be filled.",Toast.LENGTH_SHORT).show()
            return
        }

        if(mobile.isNullOrEmpty())
        {
            Toast.makeText(view.context,"Mobile must be filled.",Toast.LENGTH_SHORT).show()
            return
        }
        if(email.isNullOrEmpty())
        {
            Toast.makeText(view.context,"Email must be filled.",Toast.LENGTH_SHORT).show()
            return
        }

        if(password.isNullOrEmpty())
        {
            Toast.makeText(view.context,"Password must be filled.",Toast.LENGTH_SHORT).show()
            return
        }

        Coroutines.main {
            Toast.makeText(view.context,categoryIdValue,Toast.LENGTH_SHORT).show()

            val doctor=Doctor("1",name!!,email!!,categoryIdValue!!,password!!,mobile!!)
        db.getDoctorDetail().updatenInsert(doctor)
        }

    }

   var categoryIdValue
       get()=categoryIdItemPosition.value?.let {
       arrlist?.get(it)
   }
    set(value) {
        val position = arrlist?.indexOfFirst {
            it == value
        } ?: -1
        if (position != -1) {
            categoryIdItemPosition.value = position + 1
        }
    }
    val categoryIdItem
        get() =
            categoryIdItemPosition.value?.let {
                arrlist?.get(it)
            }

}