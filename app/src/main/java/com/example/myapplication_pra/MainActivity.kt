package com.example.myapplication_pra


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btFirst:Button = findViewById(R.id.button_goto_first_page)
        btFirst.setOnClickListener{
            val intent = Intent(this, ActivityFirst::class.java)
            startActivity(intent)
        }

        var btSecond:Button = findViewById(R.id.button_goto_second_page)
        btSecond.setOnClickListener{
            val intent = Intent(this, ActivitySecond::class.java)
            startActivity(intent)
        }
    }
}