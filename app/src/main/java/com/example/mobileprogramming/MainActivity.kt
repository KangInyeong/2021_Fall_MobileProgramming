package com.example.mobileprogramming

import android.content.Intent
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

        // use view binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 'mes' is assigned from intent which has the numbers to be get by user
        val mes = intent.getStringExtra("check")

        // If 'mes' is not null because of having the numbers, the popup is shown with the numbers.
        if (mes != null) {
            Toast.makeText(this, "You can’t call to $mes !!!!", Toast.LENGTH_SHORT).show()
        }

        // When 'button' is clicked, the code lines are executed.
        binding.button.setOnClickListener {
            val number = binding.numberText.text.toString()

            val intent_main = Intent(this, SubActivity::class.java).apply {
                putExtra("number", number)
            }


            startActivity(intent_main)
//            startActivityForResult(intent,400)

        }

    }
}






