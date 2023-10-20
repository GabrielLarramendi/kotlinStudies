package com.larramendi.edittextclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var enterText : EditText
    lateinit var convertButton : Button
    lateinit var outText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterText = findViewById(R.id.enterText)
        convertButton = findViewById(R.id.convert)
        outText = findViewById(R.id.outText)

        convertButton.setOnClickListener {
            outText.text = enterText.text.toString().uppercase()
        }
    }

}