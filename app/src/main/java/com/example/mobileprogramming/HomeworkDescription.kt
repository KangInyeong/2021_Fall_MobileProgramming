package com.example.mobileprogramming

import android.util.Log


// #1. Write a simple calculator program. The available arithmetic operators are +,-,*,and/opereators.
// Operands and operator must be separated by whitespaces. The program mush print "Cannot divide by 0" string
// when a user tries to "divide by 0" operation. Use "when" statement for operator branch.

val expression = "100 / 0" // modify this for test

// implement here

Log.d("HW01", "result: $result, (expression: $expression)")





// #2. Write a program that 1) takes a positive integer number N(less than 100), 2) creates an integer array with the size of N,
// 3) fills in this array using a set of random numbers ranging from 1~100, 4) prints out the numbers in this array.
// Note that this array MUST NOT have the duplicate numbers.

val capacity = 10 // modify this for test

// implement here

Log.d("HW01", "result: $myUniqueArray, capacity: $capacity")





// 3. Write a program that initializes an array consisting of some string lines and counts the words in each string line.

val strLine = .. // initialize string array with string lines

/* Following is an example set of string lines
"Seoul National University of Science and Technology",
"Seoul Station",
"IT Management",
"Android and Kotlin is not that difficult",
"Exit"
 */

// implent here





// #4. Write a program that takes a string, rotates it one character at a time, and prints it all.

var str = "I Love Kotlin" // modify this for test
Log.d("HW01", str)

// implement here





// #5. Implement Grade class to make the following program work. The usage of Grade class is as follows:

val math = 100 // modify these scores for test
val science = 90 // modify these scores for test
val english = 80 // modify these scores for test


val me = Grade(math, science, english)
Log.d("HW01", "my math: $math, my science: $science, my english: $english")
Log.d("HW01", "Average is ${me.average()}")

//implement Grade class





// #6. Write a code to check if a given string is palindrome or not.

val str = "jinwoo" //modify this for test

// implent here





// #7. The following is the definition of Point class.

open class Point(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int){
        this.x = x
        this.y = y
    }

    open fun show(){
        Log.d("HW01", "Current Point: ($x, $y)")
    }
}