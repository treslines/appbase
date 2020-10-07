package com.treslines.appbase

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.Gravity
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

// this class needs material deps in Module:app
// implementation 'com.google.android.material:material:1.3.0-alpha03'

fun Activity.showDialog(
    title: String? = null,
    message: String,
    positiveButtonLabel: String,
    positiveButtonClickListener: () -> Unit = {},
    negativeButtonLabel: String? = null,
    negativeButtonClickListener: () -> Unit = {},
    cancelable: Boolean = true,
    cancelListener: () -> Unit = {}
) = MaterialAlertDialogBuilder(this)
    .setTitle(title)
    .setMessage(message)
    .setPositiveButton(positiveButtonLabel) { _, _ -> positiveButtonClickListener() }
    .setNegativeButton(negativeButtonLabel) { _, _ -> negativeButtonClickListener() }
    .setCancelable(cancelable)
    .setOnCancelListener { cancelListener() }
    .create()
    .also { it.show() }

fun Activity.navigateTo(from: Context, to: Class<*>) = startActivity(Intent(from, to))

fun Activity.navigateToGooglePlayStore(applicationId: String) {
    try {
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("market://details?id=$applicationId")
            )
        )
    } catch (anfe: ActivityNotFoundException) {
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://play.google.com/store/apps/details?id=$applicationId")
            )
        )
    }
}

fun Activity.showMessage(context: Context, msg: String) {
    val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
    toast.setGravity(Gravity.CENTER, 0, 0)
    toast.show()
}
