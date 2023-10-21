package com.larramendi.radiobuttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var linearLayout : LinearLayout
    lateinit var greenRadio : RadioButton
    lateinit var yellowRadio : RadioButton
    lateinit var blueRadio : RadioButton
    lateinit var changeBgButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linearLayout)
        greenRadio = findViewById(R.id.greenButton)
        yellowRadio = findViewById(R.id.yellowButton)
        blueRadio = findViewById(R.id.blueButton)
        changeBgButton = findViewById(R.id.buttonChangeBg)

        changeBgButton.setOnClickListener {
            if (greenRadio.isChecked) {
                linearLayout.setBackgroundColor(Color.GREEN)
            }
            else if (yellowRadio.isChecked) {
                linearLayout.setBackgroundColor(Color.YELLOW)
            }
            else if (blueRadio.isChecked){
                linearLayout.setBackgroundColor(Color.BLUE)
            }
        }
    }
}