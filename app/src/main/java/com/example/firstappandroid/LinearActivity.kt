package com.example.firstappandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager


class LinearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.app_name_linear)
        setContentView(R.layout.activity_linear)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button4)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val fm: FragmentManager = supportFragmentManager
            val fragment = Fragment1()
            fm.beginTransaction().replace(R.id.container, fragment).commit()
        }

        button3.setOnClickListener {
            val fm: FragmentManager = supportFragmentManager
            val fragment = Fragment2()
            fm.beginTransaction().replace(R.id.container, fragment).commit()
        }
    }

}