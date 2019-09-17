package com.app.medicalapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.medicalapp.room.entities.Doctor
import java.util.concurrent.locks.Lock

@Database(
entities =[Doctor::class],
    version = 1
)
abstract class AppDatabase:RoomDatabase()
{
abstract fun getDoctorDetail(): Dao
//abstract fun
    companion object{
        @Volatile
        private var instance:AppDatabase?=null
        private val Lock=Any()
        operator fun invoke(context: Context)= instance?: synchronized(Lock)
        {
            instance?:buildDatabase(context).also {
            instance=it
            }
        }

        private fun buildDatabase(context: Context)=
            Room.databaseBuilder(context.applicationContext,AppDatabase::class.java,"Mydatabase.db").build()

    }
}