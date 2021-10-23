package com.example.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mobileprogramming.databinding.ActivityMainBinding
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //#hw2
        Log.d("ITM", "Main: onCreate() called!")

        //initialize the binding and assign to the binding variable
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //pass the 'binding.root' to setContentView()
        setContentView(binding.root)

        // When 'button' is clicked, the code lines are executed.
        binding.button.setOnClickListener {

            //get the number to be written
            val number = binding.numberText.text.toString()

            //First, send the number into 'SubActivity' through intent.
            Intent(this, SubActivity::class.java)

            //Use 'ACTION_DIAL' with implicit intent for showing the dial to screen and the number is sent together
            Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number")).apply {
                val intent = Intent.createChooser(this, "Which app to use?")

                //pass the number with name as number
                putExtra("number", number)

                //work the activity
                startActivity(intent)

            }

            //If there is no function to support ACTION_DIAL on device, find another activity properly.
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}






