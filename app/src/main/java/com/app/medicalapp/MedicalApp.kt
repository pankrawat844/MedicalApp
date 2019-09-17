package com.app.medicalapp

import android.app.Application
import com.app.medicalapp.activity.auth.signup.SignUpActivity
import com.app.medicalapp.activity.auth.signup.SignupViewmodel
import com.app.medicalapp.activity.auth.signup.SignupViewmodelFactory
import com.app.medicalapp.room.AppDatabase
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class MedicalApp:Application(),KodeinAware{
    override val kodein=Kodein.lazy {
        import(androidXModule(this@MedicalApp))
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { SignupViewmodelFactory(instance()) }
        bind() from singleton { SignupViewmodel(instance()) }
    }
}