package com.example.firstappandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CoordinatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.app_name_coordinator)
        setContentView(R.layout.activity_coordinator)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            var intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }
    }
}