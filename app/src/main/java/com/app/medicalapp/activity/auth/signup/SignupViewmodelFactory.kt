package com.app.medicalapp.activity.auth.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.medicalapp.room.AppDatabase

class SignupViewmodelFactory(
private val db:AppDatabase
):ViewModelProvider.NewInstanceFactory()
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SignupViewmodel(db) as T

    }
}
