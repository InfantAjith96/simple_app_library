package com.example.applib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myappsamplelibrary.SimpleLibrary

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        SimpleLibrary.simpleToast(applicationContext, "Hello this is simple toast... 👍 👍 👍")

        button.setOnClickListener {
            SimpleLibrary.simpleSnackBar(button)
        }
    }
}