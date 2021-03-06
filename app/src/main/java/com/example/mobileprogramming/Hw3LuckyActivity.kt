package com.example.mobileprogramming

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobileprogramming.databinding.ActivityHw3luckyBinding
import kotlinx.android.synthetic.main.activity_hw3lucky.*
import kotlinx.android.synthetic.main.item_view.*
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import kotlin.random.Random


class Hw3LuckyActivity : AppCompatActivity() {

    val binding by lazy { ActivityHw3luckyBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myNumber = mutableListOf<Number>()

        var cnt = 0

        //If the button is clicked to generate random numbers, this code is executed.
        randombtn.setOnClickListener {
            cnt += 1
            val array = IntArray(100) // create an array whose size is 100
            val myUnique = IntArray(6) // create another array whose size is same as ‘capacity’ variable taking a positive integer number N

            var num: Int

            // The ‘for’ loop works until ‘myUnique’ is fulled with random numbers.
            for (i in 1 until 7){
                do{
                    num = Random.nextInt(1, 46) // create 1~45 random numbers
                }while (array[num-1] == 1) // check duplicated random numbers
                array[num-1] = 1 // ‘array’ is filled with 1 (initially 0) for checking
                myUnique[i-1] = num // ‘myUnique’ is filled with random numbers
            }

            val item = Number(cnt, myUnique[0], myUnique[1], myUnique[2],myUnique[3], myUnique[4], myUnique[5])

            myNumber.add(item)

            binding.recyclerView.adapter?.notifyDataSetChanged()


        }

        deletebtn.setOnClickListener {
            myNumber.removeAll(myNumber)
            recyclerView.adapter?.notifyDataSetChanged()
        }



        val numberAdapter = NumberAdapter(myNumber)
        binding.recyclerView.adapter = numberAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)



    }

//    fun savePreference(view: View){
//        Log.e("안녕", "dkakle")
//        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
//        with (sharedPref.edit()) {
//            putInt("id", id.text.toString().toInt() )
//            putString("first",first.text.toString())
//            putInt("second", second.text.toString().toInt() )
//            putString("third",third.text.toString())
//            putInt("fourth", fourth.text.toString().toInt() )
//            putString("fifth",fifth.text.toString())
//            putString("sixth",sixth.text.toString())
//            apply()
//        }
//        Toast.makeText(this,"preference saved",Toast.LENGTH_SHORT).show()
//
//    }
//
//    fun saveFile(view: View){
//        Log.e("안녕", "dkakle")
//        val filename = "myfile"
//        val file = File(filesDir, filename)
//        val writer = BufferedWriter(FileWriter(file))
//        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
//        Toast.makeText(this,"File saved!",Toast.LENGTH_SHORT).show()
//        writer.append("my Code was ${sharedPref.getInt("ITMCode", 0)}")
//        writer.append("my Grade was ${sharedPref.getString("ITMGrade", "A+")}")
//        writer.close()
//    }

}