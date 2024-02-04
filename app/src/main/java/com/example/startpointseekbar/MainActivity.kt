package com.example.startpointseekbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.devhamza.StartPointSeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<StartPointSeekBar>(R.id.startPointSeekBar)
//        seekBar.setLineAndThumbSize(1.0f,2f,2f)
        seekBar.setProgress(0.0)
        seekBar.setOnSeekBarChangeListener(object : StartPointSeekBar.OnSeekBarChangeListener {
            override fun onOnSeekBarValueChange(bar: StartPointSeekBar?, value: Double) {

            }
        })
    }
}