package com.dragon.apps.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.roll_button)

        rollBtn.setOnClickListener{

            val diceNumber :Int = Random.nextInt(6) + 1
            Toast.makeText(this, diceNumber.toString(), Toast.LENGTH_SHORT).show()

            roll(diceNumber)
        }
    }

    private fun roll(diceNumber :Int) {
        val rollDice : ImageView = findViewById(R.id.dice)

        val drawable = when(diceNumber)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        rollDice.setImageResource(drawable)
    }
}