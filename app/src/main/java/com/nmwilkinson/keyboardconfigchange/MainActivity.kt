package com.nmwilkinson.keyboardconfigchange

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        var instanceCounter = 0
    }

    private var instanceNumber = ++instanceCounter

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.label).text = "Instance $instanceNumber"
    }
}