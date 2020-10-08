@file:Suppress("DEPRECATION")

package com.treslines.appbase

import android.app.Application
import android.preference.PreferenceManager

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this)
    }
}