package com.nmwilkinson.keyboardconfigchange

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        var onCreateCounter = 0
        var onDestroyCounter = 0
        var configChangedCounter = 0
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        ++onCreateCounter
        updateViews()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        ++configChangedCounter
        updateViews()
    }

    override fun onDestroy() {
        ++onDestroyCounter
        updateViews()
        super.onDestroy()
    }

    private fun updateViews() {
        findViewById<TextView>(R.id.configChanged).text = "onConfigChanged $configChangedCounter"
        findViewById<TextView>(R.id.onCreate).text = "onCreate $onCreateCounter"
        findViewById<TextView>(R.id.onDestroy).text = "onDestroy $onDestroyCounter"
    }
}