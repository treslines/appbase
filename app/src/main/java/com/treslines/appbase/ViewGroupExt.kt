package com.treslines.appbase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layoutResId: Int, attachToRoot: Boolean = false) =
    LayoutInflater.from(context).inflate(layoutResId, this, attachToRoot)