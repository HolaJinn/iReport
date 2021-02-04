package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterAdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_admin)

        val backBtn = findViewById<TextView>(R.id.backBtn)
        val continueBtn = findViewById<Button>(R.id.continueBtn)

        backBtn.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        continueBtn.setOnClickListener {
            intent = Intent(applicationContext, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}