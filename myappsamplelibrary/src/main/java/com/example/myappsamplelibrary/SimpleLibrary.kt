package com.example.myappsamplelibrary

import android.content.Context
import android.widget.Toast


object SimpleLibrary {
    fun simpleToast(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}