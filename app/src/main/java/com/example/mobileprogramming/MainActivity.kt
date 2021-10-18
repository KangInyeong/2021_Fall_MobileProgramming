package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //#1
//        val expression = "100 % 20" // modify this for test
//
//        // implement here
//        val list = expression.split(" ") // split ‘expression’ based on whitespace
//        val a: Int = list[0].toInt() // ‘a’ is assigned after changing its type to Int
//        val operator: String = list[1] // Operator is put into the ‘operator’ variable
//        val b: Int = list[2].toInt() // ‘b’ is assigned after changing its type to Int
//
//        // By using “when” statement, operators can be divided according to each case
//        val result = when (operator) {
//            "+" -> a + b
//            "-" -> a - b
//            "*" -> a * b
//            "/" -> if (b != 0) a / b else "Cannot divide by 0" // If user tries to “divide by 0”, the sentence is printed
//            else -> "0" // If user tries to use different operator except these 4, the program can print 0.
//        }
//
//        Log.d("HW01", "result: $result, (expression: $expression)")

        //#2
//        val capacity = 20 // modify this for test
//
//        // implement here
//        val array = IntArray(100) // create an array whose size is 100
//        val myUnique = IntArray(capacity) // create another array whose size is same as ‘capacity’ variable taking a positive integer number N
//
//        var num: Int
//
//        // The ‘for’ loop works until ‘myUnique’ is fulled with random numbers.
//        for (i in 1 until capacity+1){
//            do{
//                num = Random.nextInt(1, 101) // create 1~100 random numbers
//            }while (array[num-1] == 1) // check duplicated random numbers
//            array[num-1] = 1 // ‘array’ is filled with 1 (initially 0) for checking
//            myUnique[i-1] = num // ‘myUnique’ is filled with random numbers
//        }
//
//        val myUniqueArray = myUnique.contentToString() // ‘myUnique’ array is changed to be printed by log
//
//        Log.d("HW01", "result: $myUniqueArray, capacity: $capacity" )

        //#3
//        val strLine = arrayOf("Seoul National University of Science and Technology", "Seoul Station", "IT Management",
//            "Android and Kotlin is not that difficult", "Exit") // initialize string array with string lines
//
//        // implent here
//        // The ‘for’ loop works with ‘item’ that is one of the ‘strLine’ in order
//        for (item in strLine) {
//            val words = item.split(" ") // each string is divided by whitespace and words from the string are stored in ‘words’
//            val n = words.size // count the number of words
//
//            Log.d("HW01", "The number of words is $n")
//        }

        //#4
//        var str = "I Love Kotlin" // modify this for test
//        Log.d("HW01", str)
//
//        // implement here
//        val size = str.length // assign the string's size
//
//        //One part is needed to come forward and the other part is need to go backward after sliced.
//        for(i in 1 until size+1 step 1){
//            Log.d("HW02", str.slice(i until size) + str.slice(0 until i))
//        }

        //#5-1
//        val math = 100 // modify these scores for test
//        val science = 100 // modify these scores for test
//        val english = 90 // modify these scores for test
//
//
//        val me = Grade(math, science, english)
//        Log.d("HW01", "my math: $math, my science: $science, my english: $english")
//        Log.d("HW01", "Average is ${me.average()}")

        //#6
//        val str = "WoWoW" //modify this for test
//
//        // implent here
//        val rts = str.reversed() // The string named as 'str' is reversed and assigned in to 'rts.
//
//        when(str == rts){
//            true -> Log.d("HW01", "$str is palindrome!") // 'str' is same with 'rts' because the string is palindrome
//            else -> Log.d("HW01", "$str is Not palindrome!") //'str' is different with 'rts' because the string is not palindrome
//        }

        //#6-1
        val p = Point(5,5)
        p.x=10
        p.y=20
        p.show()

        val cp = ColorPoint(5, 5, "YELLOW")
        cp.setPoint(10, 20)
        cp.color = "GREEN"
        cp.y=100
        cp.show()

    }
}

//#5-2
////The 'Grade' calss has 'math', 'science', and 'english' variable as parameter.
//class Grade(var math: Int, var science: Int, var english: Int) {
//    // The 'average' function returns average of three values
//    fun average(): Int {
//        return (math + science + english) / 3
//    }
//}

//#6-2
open class Point(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    open fun show(){
        Log.d("HW01","Current Point: ($x, $y)")
    }
}

// The 'ColorPoint' has 'x', 'y', and 'color' variable as parameter and extends 'Point' calss.
class ColorPoint(x: Int, y: Int, color: String): Point(x,y) {

    // In the setter of 'y', 'field' is original one and 'value' is changed one.
    override var y = y
        set(value){
            if (field != value) Log.d("HW01","Y has been changed to $value") // If the change of 'y' happens, the message is printed.
            field = value // reassigned by new value
        }

    // The 'color' of 'ColorPoint' is defined.
    var color = color

    // The 'setPoint' function changes 'x' and 'y' into each new value when the function is called.
    fun setPoint(x: Int,y: Int){
        this.x = x
        this.y = y
    }

    // The 'show' function prints Log which shows 'color' and 'x' and 'y' of current point.
    override fun show(){
        Log.d("HW01","Color:$color Current Point: ($x, $y)")
    }
}





