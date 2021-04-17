package com.example.roomdemo

import android.app.Application
import androidx.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object{
        lateinit var app: App
    }
    override fun onCreate() {
        super.onCreate()
        app = this
        MultiDex.install(this)

    }
}