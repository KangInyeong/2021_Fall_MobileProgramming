package com.example.mobileprogramming

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileprogramming.databinding.ActivityProjectBinding

class ProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Make Toolbar
        setSupportActionBar(binding.toolbar)


        binding.btn.setOnClickListener {
            Toast.makeText(this, "Thank you😀", Toast.LENGTH_SHORT).show()
        }


    }
}