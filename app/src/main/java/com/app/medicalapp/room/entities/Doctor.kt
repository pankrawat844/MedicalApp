package com.app.medicalapp.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
const val CURRENT_USER=0

@Entity
data class Doctor(val id:String,
                    val name:String,
                  val email:String,
                  val category:String,
                  val password:String,
                  val mobile:String)
{
@PrimaryKey(autoGenerate = false)
var uid:Int= CURRENT_USER
}