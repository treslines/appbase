package com.treslines.appbase

import android.content.SharedPreferences

const val PREF_KEY_RATING_DONE_BOOL = "RATING_DONE"
const val PREF_KEY_RATING_INTERVAL_INT = "RATING_INTERVAL"
lateinit var sharedPrefs: SharedPreferences

fun SharedPreferences.putAny(name: String, any: Any) {
    when (any) {
        is String -> edit().putString(name, any).apply()
        is Int -> edit().putInt(name, any).apply()
        is Boolean -> edit().putBoolean(name, any).apply()
        // also accepts Float, Long & StringSet
    }
}

fun SharedPreferences.remove(name: String) {
    edit().remove(name).apply()
}