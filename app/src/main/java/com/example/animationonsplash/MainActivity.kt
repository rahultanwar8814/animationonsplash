package com.example.animationonsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button


import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.fab)

        button.setOnClickListener(){
            startActivity(Intent(this@MainActivity, AnimationState::class.java))


        }

    }
}
