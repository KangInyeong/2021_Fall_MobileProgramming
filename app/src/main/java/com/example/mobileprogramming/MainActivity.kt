package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str = "I Love Kotlin" // modify this for test
        Log.d("HW01", str)

        // implement here
//        for( item in str ) Log.d("HW01", item.toString())

//        var complete = StringBuilder()
//
//        for(i in 1..str.length step 1){
//            for(j in 1..str.length step 1){
//                val letter = str[j]
//
//                complete.append(letter)
//            }
//            Log.d("HW01", "$complete")
//        }


    }
}
