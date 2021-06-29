package com.example.a2021drm2rev1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database(entities = [Nome::class], version = 1 )
abstract class NomeDataBase : RoomDatabase() {

    abstract  fun NomeDao (): NomeDAO

    companion object{

        private var database: NomeDataBase? = null

        private val DATABASE = "NomeDB"

        fun getInstance(context: Context): NomeDataBase? {
            if(database == null)
                return criaBanco(context)
            else
                return database
        }

        private fun criaBanco(context: Context): NomeDataBase{
            return Room.databaseBuilder(context, NomeDataBase::class.java, DATABASE)
                .allowMainThreadQueries()
                .build()
        }

    }
}