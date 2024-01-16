package com.example.fragmentsalvarorodriguez

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
internal class FragmentsApp : Application(){
    override fun onCreate() {
        super.onCreate()
    }
}