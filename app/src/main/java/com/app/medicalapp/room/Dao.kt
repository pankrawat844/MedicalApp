package com.app.medicalapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.medicalapp.room.entities.CURRENT_USER
import com.app.medicalapp.room.entities.Doctor

@Dao
interface Dao {

@Query("select * from Doctor where uid=$CURRENT_USER")
fun getDoctorDetail():LiveData<Doctor>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatenInsert(doctor: Doctor):Long

}