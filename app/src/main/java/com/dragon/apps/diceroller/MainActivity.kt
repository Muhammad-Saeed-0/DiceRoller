package com.dragon.apps.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.roll_button)

        rollBtn.setOnClickListener{
            //Toast.makeText(this, "Roll btn is clicked", Toast.LENGTH_SHORT).show()

            rollDice()
        }
    }

    private fun rollDice() {
        val rollResult : TextView = findViewById(R.id.roll_textView)
        rollResult.text = (Random.nextInt(6) + 1).toString()
    }
}