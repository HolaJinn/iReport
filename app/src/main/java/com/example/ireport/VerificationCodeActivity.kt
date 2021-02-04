package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VerificationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)

        val backBtn = findViewById<TextView>(R.id.backBtn)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        backBtn.setOnClickListener {
            intent = Intent(applicationContext, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

        nextBtn.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}