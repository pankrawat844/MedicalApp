package com.app.medicalapp.activity.auth

interface AuthListner {
fun onStarted()
    fun OnSuccess()
    fun OnFailure(msg:String)

}