package com.kotlin.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var ivDiceNumber : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRollDice : Button = findViewById(R.id.btn_dice_roll)
        ivDiceNumber = findViewById(R.id.iv_dice_number)
        btnRollDice.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomDiceNumber = Random.nextInt(6) + 1
        val diceDrawableResource : Int = when(randomDiceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        ivDiceNumber.setImageResource(diceDrawableResource)
    }
}
