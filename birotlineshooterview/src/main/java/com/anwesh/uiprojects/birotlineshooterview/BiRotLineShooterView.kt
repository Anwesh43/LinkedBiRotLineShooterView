package com.anwesh.uiprojects.birotlineshooterview

/**
 * Created by anweshmishra on 18/08/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.content.Context
import android.app.Activity

val colors : Array<String> = arrayOf("#3F51B5", "#009688", "#F44336", "#4CAF50", "#03A9F4")
val parts : Int = 3
val scGap : Float = 0.02f / parts
val sizeFactor : Float = 5.4f
val strokeFactor : Float = 90f
val delay : Long = 20
val rot : Float = 45f
val backColor : Int = Color.parseColor("#BDBDBD")

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
