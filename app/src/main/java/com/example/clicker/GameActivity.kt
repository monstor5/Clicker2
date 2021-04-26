package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameActivity : AppCompatActivity() {


    var coutmoney = 0
    var money = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.countTextView).text = coutmoney.toString()
            coutmoney++
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            var intent = Intent(this, ShopActivity2::class.java)
            startActivity(intent)

        }
    }
}