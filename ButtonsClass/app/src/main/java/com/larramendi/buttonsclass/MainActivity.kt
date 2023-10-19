package com.larramendi.buttonsclass

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private lateinit var b01 : Button
    private lateinit var b02: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b01 = findViewById(R.id.button01)
        b02 = findViewById(R.id.button02)
        b02.isVisible = false

        b01.setOnClickListener {
            b02.isVisible = true
            b01.isVisible = false
        }

        b02.setOnClickListener {
            b01.isVisible = true
            b02.isVisible = false
        }
    }
}