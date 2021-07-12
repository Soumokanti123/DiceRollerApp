package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Inflate the activity_main.xml , R stand for Resource folder

        val rollButton : Button = findViewById(R.id.result_button)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomNumber = Random().nextInt(6)+1
        val drawableIma = when (randomNumber) {  // when pe jo resource araha tha usko store karliya drawable pe
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Toast.makeText(this, "The Number is $randomNumber", Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(drawableIma)  // drawable ko set kar diya hamara jo diceImage hai uspe
    }
}