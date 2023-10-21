package com.larramendi.imageview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var button01 : Button
    lateinit var button02 : Button
    lateinit var button03 : Button
    lateinit var image1 : ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button01 = findViewById(R.id.foto01)
        button02 = findViewById(R.id.foto02)
        button03 = findViewById(R.id.mostrar)

        image1 = findViewById(R.id.fotoLaura01)

        image1.isVisible = false

        button01.setOnClickListener {
            image1.setImageResource(R.drawable.lalura2)
        }

        button02.setOnClickListener {
            image1.setImageResource(R.drawable.laura1)
        }

        button03.setOnClickListener {
            image1.isVisible = true
        }
    }
}