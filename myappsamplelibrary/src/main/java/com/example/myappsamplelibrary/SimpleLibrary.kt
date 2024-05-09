package com.example.myappsamplelibrary

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


object SimpleLibrary {
    fun simpleToast(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun simpleSnackBar(view: View) {
        val snackBar = Snackbar.make(view, "Hello...", Snackbar.LENGTH_LONG).setAction("Welcome") { }
        snackBar.setActionTextColor(Color.RED)
        val snackBarView = snackBar.view
        val textView = snackBarView.findViewById<View>(com.google.android.material.R.id.snackbar_text) as TextView
        textView.setTextColor(Color.YELLOW)
        snackBar.show()
    }
}