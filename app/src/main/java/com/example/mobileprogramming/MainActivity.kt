package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // #1
        val expression = "100 / 0" // modify this for test

        // implement here
        val list = expression.split(" ")
        val a: Int = list[0].toInt()
        val operator: String = list[1]
        val b: Int = list[2].toInt()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> if (b != 0) a / b else "Cannot divide by 0"
            else -> "0"
            }

        Log.d("HW01", "result: $result, (expression: $expression)")


    }
}
