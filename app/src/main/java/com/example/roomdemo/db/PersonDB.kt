package com.example.roomdemo.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Team::class],
    version = 1,
    exportSchema = true
)
abstract class PersonDB : RoomDatabase() {
    abstract fun teamDao(): TeamDao
}