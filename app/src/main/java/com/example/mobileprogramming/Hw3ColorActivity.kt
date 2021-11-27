package com.example.mobileprogramming

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileprogramming.databinding.ActivityHw3colorBinding
import kotlin.random.Random

class Hw3ColorActivity : AppCompatActivity() {

    // binding the layout
    val binding by lazy { ActivityHw3colorBinding.inflate(layoutInflater) }

    // make variable
    var text = "hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set view
        setContentView(binding.root)

        // If you click the button the text's color and text is changed by generated random color from "MakeColor()".
        binding.button.setOnClickListener {
            binding.textView.setTextColor(MakeColor())
            binding.textView.text = text
        }
    }

    // Create random color with using red, green, blue's number
    fun MakeColor(): Int {
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)
        text = "COLOR: ${red}r ${green}g ${blue}b"
        return Color.argb(255,red ,green , blue)
    }


}