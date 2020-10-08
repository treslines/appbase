package com.treslines.appbase

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment


fun Fragment.hideKeyboard(view: View? = activity?.currentFocus) {
    inputMethodManger()?.hideSoftInputFromWindow(view?.applicationWindowToken, 0)
}

fun Fragment.showKeyboard(context: Context?) {
    (context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).toggleSoftInput(
        InputMethodManager.SHOW_FORCED,
        InputMethodManager.HIDE_IMPLICIT_ONLY
    )
}

fun Fragment.inputMethodManger() =
    context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager

fun Fragment.dialPhoneNumber(phoneNumber: String) {
    val intent = Intent(Intent.ACTION_DIAL).apply {
        data = Uri.parse("tel:$phoneNumber")
    }
    if (intent.resolveActivity(requireContext().packageManager) != null) {
        startActivity(intent)
    }
}

fun Fragment.openWebPage(url: String) {
    val webpage: Uri = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, webpage)
    if (intent.resolveActivity(requireContext().packageManager) != null) {
        startActivity(intent)
    }
}

