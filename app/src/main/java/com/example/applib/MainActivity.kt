package com.example.applib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myappsamplelibrary.SimpleLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SimpleLibrary.simpleToast(applicationContext, "Hello this is simple toast... 👍 👍 👍")
    }
}