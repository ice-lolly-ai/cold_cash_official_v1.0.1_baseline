package com.example.simplebuttongrid

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Initialize ImageButtons
        val button4 = findViewById<ImageButton>(R.id.button4)
        val button5 = findViewById<ImageButton>(R.id.button5)
        val button6 = findViewById<ImageButton>(R.id.button6)
        val button7 = findViewById<ImageButton>(R.id.button7)

        // Set up click listeners
        button4.setOnClickListener {
            // Handle button 4 click
        }

        button5.setOnClickListener {
            // Handle button 5 click
        }

        button6.setOnClickListener {
            // Handle button 6 click
        }

        button7.setOnClickListener {
            // Handle button 7 click
            finish()
        }
    }
}
