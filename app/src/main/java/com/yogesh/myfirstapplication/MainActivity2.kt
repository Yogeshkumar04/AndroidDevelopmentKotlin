package com.yogesh.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //getting the user Name from the first activity

        val userName = intent.getStringExtra("USER")

        val textView = findViewById<TextView>(R.id.tvOffer)

        val message = "$userName , you will get free access to all the content for one month"

        // showing the content
        textView.text = message
    }
}