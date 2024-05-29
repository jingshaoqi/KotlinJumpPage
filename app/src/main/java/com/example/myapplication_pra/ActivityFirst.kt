package com.example.myapplication_pra

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityFirst: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page)
        init()
    }
    private fun init(){
        val bt:Button = findViewById<Button>(R.id.button_goto_main_page)
        bt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }
    }
}