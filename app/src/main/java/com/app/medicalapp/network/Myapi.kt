package com.app.medicalapp.network

import com.app.medicalapp.activity.auth.login.LoginResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Myapi {
    @FormUrlEncoded
    @POST("login.php")
    fun login(@Field("email") email:String,
              @Field("passowrd") password:String):Response<LoginResponse>
}