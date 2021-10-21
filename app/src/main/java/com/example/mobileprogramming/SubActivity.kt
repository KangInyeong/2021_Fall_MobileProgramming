package com.example.mobileprogramming

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mobileprogramming.databinding.ActivityMainBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //#hw2
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val number = intent.getStringExtra("number")
        Log.d("itm","hey $number")
        val uri = Uri.parse("tel:$number")

        val intent_dial = Intent(Intent.ACTION_DIAL).apply {
//            data = Uri.parse("tel:$number")
            Intent.createChooser(this, "Which app to use?")
            putExtra("checking",uri)
        }


        val dial = Intent(Intent.ACTION_VIEW, Uri.parse("tel:$number")).apply {
            val checking = getStringExtra("checking")
            putExtra("check",uri)
            val hi = uri
            Log.d("itm", "예써비어 $hi")
            Log.d("itm", "예써비어dd $checking")
        }


        startActivity(dial)
    }
}