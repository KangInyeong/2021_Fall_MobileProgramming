package com.example.mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileprogramming.databinding.ActivityHw3changeBinding
import com.example.mobileprogramming.databinding.ActivityHw3colorBinding

class Hw3ChangeActivity : AppCompatActivity(){

    // binding the layout
    val binding by lazy { ActivityHw3changeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val money = "money"

        binding.num1.setOnClickListener {

        }

        binding.num2.setOnClickListener {

        }

        binding.num3.setOnClickListener {

        }

        binding.num4.setOnClickListener {

        }

        binding.num5.setOnClickListener {

        }

        binding.num6.setOnClickListener {

        }

        binding.num7.setOnClickListener {

        }

        binding.num8.setOnClickListener {

        }

        binding.num9.setOnClickListener {

        }

        binding.num0.setOnClickListener {

        }

        binding.clear.setOnClickListener {

        }

    }
}