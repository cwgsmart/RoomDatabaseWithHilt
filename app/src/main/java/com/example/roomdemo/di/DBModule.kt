package com.example.roomdemo.di

import android.content.Context
import androidx.room.Room
import com.example.roomdemo.db.PersonDB
import com.example.roomdemo.db.TeamDao
//import com.example.multthreaddemo.db.PersonDB
//import com.example.multthreaddemo.db.TeamDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DBModule {
    @Provides
    @Singleton
    fun providerAppDataBase (@ApplicationContext appContext: Context): PersonDB {
        return Room.databaseBuilder(appContext, PersonDB::class.java,"PersonDB")
            .fallbackToDestructiveMigration()
//            .allowMainThreadQueries()
            .addMigrations()
            .build()
    }



    @Provides
    @Singleton
    fun providerTeamDao(personDB: PersonDB): TeamDao {
        return personDB.teamDao()
    }


}