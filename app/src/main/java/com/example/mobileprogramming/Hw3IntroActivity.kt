package com.example.mobileprogramming

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileprogramming.databinding.ActivityHw3introBinding
import com.example.mobileprogramming.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_hw3intro.*


class Hw3IntroActivity: AppCompatActivity() {

    //Use menu on Toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        binding.toolbar.inflateMenu(R.menu.menu)
        return true
    }

    //Use items of menu on Toolbar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(Intent.ACTION_VIEW)
        return when (item.itemId) {
            R.id.instagram -> {
                Snackbar.make(
                    binding.root,
                    "Move to KangInyeong's Instagram",
                    Snackbar.LENGTH_SHORT
                ).show()
                intent.data = Uri.parse("https://www.instagram.com/kiyoog_hi/")
                startActivity(intent)
                true
            }
            R.id.Github -> {
                Snackbar.make(binding.root, "Move to KangInyeong's Github", Snackbar.LENGTH_SHORT)
                    .show()
                intent.data = Uri.parse("https://github.com/KangInyeong")
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // binding the layout
    val binding by lazy { ActivityHw3introBinding.inflate(layoutInflater) }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Make Toolbar
        setSupportActionBar(binding.toolbar)

        // Use scrollview
        scrollview.post {
            scrollview.fullScroll(ScrollView.FOCUS_UP)
        }

        // Use Chip components
        val text = "I will try to get good skill"
        chip1.setOnClickListener {
            val mySnackbar = Snackbar.make(binding.root, text.toString(), Snackbar.LENGTH_LONG)
            mySnackbar.setAction("Cheer Up!"){

            }
            mySnackbar.show()
        }


        val positiveButtonClick = { dialogInterface: DialogInterface, i: Int ->
            toast("Let's go~!")
        }
        val negativeButtonClick = { dialogInterface: DialogInterface, i: Int ->
            Toast.makeText(this, "I am so sad..", Toast.LENGTH_SHORT).show()
        }

        chip3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                .setTitle("Projcet")
                .setMessage("Do you want to see inyeong's Kotlin team project?")
                .setPositiveButton("Yeap",positiveButtonClick)
                .setNegativeButton("Nope", negativeButtonClick)
                .show()

        }


    }
    fun toast(message:String){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        val intent = Intent(this, ProjectActivity::class.java)
        startActivity(intent)

    }

}
