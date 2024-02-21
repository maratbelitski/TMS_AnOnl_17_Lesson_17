package com.example.tms_anonl_17_lesson_17

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.btn_next).setOnClickListener {
            startActivity(ThirdActivity().launchIntent(this))
        }

        findViewById<Button>(R.id.btn_prev).setOnClickListener {
            finish()
        }
    }

    fun launchIntent(context: Context): Intent {
        return Intent(context, SecondActivity::class.java)
    }
}