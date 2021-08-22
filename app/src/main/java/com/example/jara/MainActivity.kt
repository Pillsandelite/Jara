package com.example.jara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)
        val clickButton : Button = findViewById(R.id.button)

        clickButton.setOnClickListener {
            clickButton.text = getString(R.string.app_name)
            image.visibility = View.VISIBLE
        }


}}