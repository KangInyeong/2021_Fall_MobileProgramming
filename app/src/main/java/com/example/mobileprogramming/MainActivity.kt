package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

open class Point(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }


    open fun show(){
        Log.d("HW01","Current Point: ($x, $y)")
    }

}

class ColorPoint(x: Int, y: Int, color: String): Point(x,y) {

    override var x = x

    override var y = y
        set(value){
            //여기 다른게 문제군,,
            if (this.x != value) Log.d("HW01","Y has been changed to $value")
            this.x = value
        }

    var color = color

//    set(value){
//        if (this.x != x) Log.d("HW01","Y has been changed to $y")
//        val oldyy = this.x
//        this.x = x
//        this.y = y
//        field = value
//        Log.d("HW01","Yxxx  $oldyy")
//    }

    fun setPoint(x: Int,y: Int){
//        if (this.x != x ) Log.d("HW01","Y has been changed to $y")

        this.x = x
        this.y = y

        }

    override fun show(){
        Log.d("HW01","Color:$color Current Point: ($x, $y)")
    }

}


