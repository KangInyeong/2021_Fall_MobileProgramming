package com.example.mobileprogramming

import android.util.Log

//
//// #1. Write a simple calculator program. The available arithmetic operators are +,-,*,and/opereators.
//// Operands and operator must be separated by whitespaces. The program mush print "Cannot divide by 0" string
//// when a user tries to "divide by 0" operation. Use "when" statement for operator branch.
//
//val expression = "100 / 0" // modify this for test
//
//// implement here
//
//Log.d("HW01", "result: $result, (expression: $expression)")
//
//코드
/**
 *    // #1
val expression = "100 / 0" // modify this for test

// implement here
val list = expression.split(" ") // expression을 split을 활용해서 공백을 기준으로 나누어 배열에 담는다.
val a: Int = list[0].toInt() // String 타입을 Int로 변환하여 a에 담는다.
val operator: String = list[1] // 연산자를 담는다.
val b: Int = list[2].toInt() // String 타입을 Int로 변환하여 b에 담는다.

// when을 사용하여 연산자에 따라 경우를 나누고, 해당 연산 결과는 result에 바로 담는다.
val result = when (operator) {
"+" -> a + b
"-" -> a - b
"*" -> a * b
"/" -> if (b != 0) a / b else "Cannot divide by 0" // 0으로 나누고자 할 때에는 문구를 출력한다.
else -> "0" // 4가지 외에 다른 기호 또는 문자를 사용할 경우 0을 출력한다.
}

Log.d("HW01", "result: $result, (expression: $expression)")

 */
//
//
//
//// #2. Write a program that 1) takes a positive integer number N(less than 100), 2) creates an integer array with the size of N,
//// 3) fills in this array using a set of random numbers ranging from 1~100, 4) prints out the numbers in this array.
//// Note that this array MUST NOT have the duplicate numbers.
//
//val capacity = 10 // modify this for test
//
//// implement here
//
//Log.d("HW01", "result: $myUniqueArray, capacity: $capacity")
//
//
/**교수님께 꼭 array 형식으로 결과가 얻어져야 하는 것인지 여쭤보기
 * //        #2. Write a program.

val capacity = 10 // modify this for test

// implement here
//        val myUniqueArray = List(capacity) { Random.nextInt(0, 100) }

//        val myUniqueArray = IntArray(capacity) { (0..100).random() }

val myUniqueArray = IntArray(capacity) { Random.nextInt(0,100) }.asList()

Log.d("HW01", "result: $myUniqueArray, capacity: $capacity")
 */
//
//
//
//// 3. Write a program that initializes an array consisting of some string lines and counts the words in each string line.
//
//val strLine = .. // initialize string array with string lines
//
///* Following is an example set of string lines
//"Seoul National University of Science and Technology",
//"Seoul Station",
//"IT Management",
//"Android and Kotlin is not that difficult",
//"Exit"
// */
//
//// implent here
//
//
/** 교수님께 string array가 뭔지 여쭤보기 / string lines 라고 하신 이유가 뭘지,,,
 * val strLine = "Seoul National University of Science and Technology" // initialize string array with string lines

/* Following is an example set of string lines
"Seoul National University of Science and Technology",
"Seoul Station",
"IT Management",
"Android and Kotlin is not that difficult",
"Exit"
*/

// implent here
val words = strLine.split(" ")
val n = words.size
Log.d("HW01", "The number of words is $n")

 */
//
//
//
//// #4. Write a program that takes a string, rotates it one character at a time, and prints it all.
//
//var str = "I Love Kotlin" // modify this for test
//Log.d("HW01", str)
//
//// implement here
//
//
/**
 * var str = "I Love Kotlin" // modify this for test
Log.d("HW01", str)

// implement here

val size = str.length

for(i in 1 until size+1 step 1){
Log.d("HW02", str.slice(i until size) + str.slice(0 until i))
}
 *
 */
//
//
//
//// #5. Implement Grade class to make the following program work. The usage of Grade class is as follows:
//
//val math = 100 // modify these scores for test
//val science = 90 // modify these scores for test
//val english = 80 // modify these scores for test
//
//
//val me = Grade(math, science, english)
//Log.d("HW01", "my math: $math, my science: $science, my english: $english")
//Log.d("HW01", "Average is ${me.average()}")
//
////implement Grade class
//
//
/**
 * class Grade(var math: Int, var science: Int, var english: Int) {

fun average(): Int {
return (math + science + english) / 3
}
}
 *
 */
//
//
//
//// #6. Write a code to check if a given string is palindrome or not.
//
//val str = "jinwoo" //modify this for test
//
//// implent here
//
//
//
/**
 *  val str = "WoWoW" //modify this for test

// implent here

val rts = str.reversed()

when(str == rts){
true -> Log.d("HW01", "$str is palindrome!")
else -> Log.d("HW01", "$str is Not palindrome!")
}
 *
 */
//
//
//// #7. The following is the definition of Point class.
//
//open class Point(open var x: Int, open var y: Int) {
//    fun move(x: Int, y: Int){
//        this.x = x
//        this.y = y
//    }
//
//    open fun show(){
//        Log.d("HW01", "Current Point: ($x, $y)")
//    }
//}