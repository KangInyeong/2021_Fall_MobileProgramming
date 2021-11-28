package com.example.mobileprogramming

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileprogramming.databinding.ActivityHw3changeBinding
import com.example.mobileprogramming.databinding.ActivityHw3colorBinding
import kotlinx.android.synthetic.main.activity_hw3change.*

class Hw3ChangeActivity : AppCompatActivity(){

    // binding the layout
    val binding by lazy { ActivityHw3changeBinding.inflate(layoutInflater) }


    // initialize the variables
    var result = ""
    var price = ""

    var nd20 = ""
    var nd10 = ""
    var nd5 = ""
    var nd1 = ""
    var nc25 = ""
    var nc10 = ""
    var nc5 = ""
    var nc1 = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /**This part code is same num1 ~ num9 button's case. **/
        //If the num1 button is clicked, this event is executed.
            binding.num1.setOnClickListener {
                //It checks the number of the input numbers because I have to put '.' on between numbers.
                if (result.length >= 2){
                    result += "1"//update the number with 1
                    // The numbers are divided to two part because I have to put '.'.
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back" // It has to be shown the user
                    txt_price.text = price

                    var cal = front.toInt() // make the numbers to int type for calculating

                    // calculate the numbers according to unit of money
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{

                    // If he length of the input numbers is not over 2, it doesn't need to consider dollar unit.
                    result += "1"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"

                }
            }

            binding.num2.setOnClickListener {
                if (result.length >= 2){
                    result += "2" //update the number with 1
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "2"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num3.setOnClickListener {
                if (result.length >= 2){
                    result += "3"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "3"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num4.setOnClickListener {
                if (result.length >= 2){
                    result += "4"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "4"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num5.setOnClickListener {
                if (result.length >= 2){
                    result += "5"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "5"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num6.setOnClickListener {
                if (result.length >= 2){
                    result += "6"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "6"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num7.setOnClickListener {
                if (result.length >= 2){
                    result += "7"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "7"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num8.setOnClickListener {
                if (result.length >= 2){
                    result += "8"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "8"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num9.setOnClickListener {
                if (result.length >= 2){
                    result += "9"
                    var front = result.substring(0,result.length-2)
                    var back = result.substring(result.length-2,result.length)
                    price = "$front.$back"
                    txt_price.text = price

                    var cal = front.toInt()
                    nd20 = (cal / 20).toString()
                    cal %= 20
                    binding.dollar20.text = "$20: ${nd20.toString()}"
                    nd10 = (cal /10).toString()
                    cal %= 10
                    binding.dollar10.text = "$10: ${nd10.toString()}"
                    nd5 = (cal /5).toString()
                    cal %= 5
                    binding.dollar5.text = "$5: ${nd5.toString()}"
                    nd1 = (cal /1).toString()
                    cal %= 1
                    binding.dollar1.text = "$1: ${nd1.toString()}"

                    var ccal = back.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }else{
                    result += "9"
                    txt_price.text = result

                    var ccal = result.toInt()
                    nc25 = (ccal/25).toString()
                    ccal %= 25
                    binding.cent25!!.text = "25¢: ${nc25.toString()}"
                    nc10 = (ccal/10).toString()
                    ccal %= 10
                    binding.cent10!!.text = "10¢: ${nc10.toString()}"
                    nc5 = (ccal/5).toString()
                    ccal %= 5
                    binding.cent5!!.text = "5¢: ${nc5.toString()}"
                    nc1 = (ccal/1).toString()
                    ccal %= 1
                    binding.cent1!!.text = "1¢: ${nc1.toString()}"
                }
            }

            binding.num0.setOnClickListener {
                //If there is no number before zero is clicked, zero isn't needed to add.
                if(result == ""){
                    result = ""
                }else{
                    if (result.length >= 2){
                        result += "0"
                        var front = result.substring(0,result.length-2)
                        var back = result.substring(result.length-2,result.length)
                        price = "$front.$back"
                        txt_price.text = price

                        var cal = front.toInt()
                        nd20 = (cal / 20).toString()
                        cal %= 20
                        binding.dollar20.text = "$20: ${nd20.toString()}"
                        nd10 = (cal /10).toString()
                        cal %= 10
                        binding.dollar10.text = "$10: ${nd10.toString()}"
                        nd5 = (cal /5).toString()
                        cal %= 5
                        binding.dollar5.text = "$5: ${nd5.toString()}"
                        nd1 = (cal /1).toString()
                        cal %= 1
                        binding.dollar1.text = "$1: ${nd1.toString()}"

                        var ccal = back.toInt()
                        nc25 = (ccal/25).toString()
                        ccal %= 25
                        binding.cent25!!.text = "25¢: ${nc25.toString()}"
                        nc10 = (ccal/10).toString()
                        ccal %= 10
                        binding.cent10!!.text = "10¢: ${nc10.toString()}"
                        nc5 = (ccal/5).toString()
                        ccal %= 5
                        binding.cent5!!.text = "5¢: ${nc5.toString()}"
                        nc1 = (ccal/1).toString()
                        ccal %= 1
                        binding.cent1!!.text = "1¢: ${nc1.toString()}"
                    }else{
                        result += "0"
                        txt_price.text = result

                        var ccal = result.toInt()
                        nc25 = (ccal/25).toString()
                        ccal %= 25
                        binding.cent25!!.text = "25¢: ${nc25.toString()}"
                        nc10 = (ccal/10).toString()
                        ccal %= 10
                        binding.cent10!!.text = "10¢: ${nc10.toString()}"
                        nc5 = (ccal/5).toString()
                        ccal %= 5
                        binding.cent5!!.text = "5¢: ${nc5.toString()}"
                        nc1 = (ccal/1).toString()
                        ccal %= 1
                        binding.cent1!!.text = "1¢: ${nc1.toString()}"
                    }
                }

            }
        //If the 'clear' button is clicked, all texts are cleard to zero.
            binding.clear.setOnClickListener {
                result = ""
                txt_price.text = "0"
                dollar20.text = "$20: 0"
                dollar10.text = "$10: 0"
                dollar5.text = "$5: 0"
                dollar1.text = "$1: 0"
                cent25.text = "25¢: 0"
                cent10.text = "10¢: 0"
                cent5.text = "5¢: 0"
                cent1.text = "1¢: 0"
            }


    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("result", result)
            putString("price", price)
            putString("nd20", nd20)
            putString("nd10", nd10)
            putString("nd5", nd5)
            putString("nd1", nd1)
            putString("nc25", nc25)
            putString("nc10", nc10)
            putString("nc5", nc5)
            putString("nc1", nc1)
        }
        Log.d("ITM", "onSave called!")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("ITM", "onRestore called!")
        savedInstanceState.getString("result").toString().also {
            txt_price.text = it
            result = it
        }
        savedInstanceState.getString("price").toString().also {
            price = it
        }
        savedInstanceState.getString("nd20").toString().also {
            binding.dollar20.text = it
            nd20 = it
        }
        savedInstanceState.getString("nd10").toString().also {
            dollar10.text = it
            nd10 = it
        }
        savedInstanceState.getString("nd5").toString().also {
            dollar5.text = it
            nd5 = it
        }
        savedInstanceState.getString("nd1").toString().also {
            dollar1.text = it
            nd1 = it
        }
        savedInstanceState.getString("nc25").toString().also {
            cent25.text = it
            nc25 = it
        }
        savedInstanceState.getString("nc10").toString().also {
            cent10.text = it
            nc10 = it
        }
        savedInstanceState.getString("nc5").toString().also {
            cent5.text = it
            nc5 = it
        }
        savedInstanceState.getString("nc1").toString().also {
            cent1.text = it
            nc1 = it
        }
    }

}