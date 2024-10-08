package com.example.simplebuttongrid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Set onClickListener for each button to start the SecondActivity
        val buttonClickListener = View.OnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener(buttonClickListener)
        button2.setOnClickListener(buttonClickListener)
        button3.setOnClickListener(buttonClickListener)
    }
}
