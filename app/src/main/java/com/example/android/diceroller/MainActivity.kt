package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        //val countUpButton: Button = findViewById(R.id.count_up_button)
       // countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
         //   Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        var randomInt = (1..6).random()
        var drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
    /*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val countStr = resultText.text.toString()
        when (countStr){
            "Hello World!" -> resultText.text = "1"
            "1","2","3","4","5" -> {
                resultText.text = (countStr.toInt() + 1).toString()
            }
        }
    }*/
}