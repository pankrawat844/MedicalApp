package com.app.medicalapp.activity.auth

interface AuthListner {
fun onStarted()
    fun OnSuccess(msg: String)
    fun OnFailure(msg:String)

}