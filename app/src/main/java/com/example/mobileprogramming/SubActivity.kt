package com.example.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mobileprogramming.databinding.ActivityMainBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //#hw2

        //use view binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Receive the number though intent from MainActivity then assign it
        val num = intent.getStringExtra("number")

        //Make pop-up message by using Toast when SubActivity is replied
        if(num != null){

            //If the user doesn't fill the black, the pop-up message shows the text
            if(num.isEmpty()){
                Toast.makeText(this, "Put your number!!!!", Toast.LENGTH_SHORT).show()
            }

            //If the user fills the black, the pop-up message shows the text
            Toast.makeText(this, "You can’t call to $num!!!!", Toast.LENGTH_SHORT).show()
        }

        //Then, finish this SubActivity
        finish()
    }
}