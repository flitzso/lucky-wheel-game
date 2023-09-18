package com.flitzso.lucky_wheel_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils // Corrija a importação
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClockWise = findViewById<ImageButton>(R.id.clockwise) as ImageButton

        btnClockWise.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView) as ImageView
            val animation: Animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.clockwise)
            image.startAnimation(animation)
        }
    }
}