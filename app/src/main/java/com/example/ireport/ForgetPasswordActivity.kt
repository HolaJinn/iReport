package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        val backBtn = findViewById<TextView>(R.id.backBtn)
        val verificationBtn = findViewById<Button>(R.id.verification)

        backBtn.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        verificationBtn.setOnClickListener {
            intent = Intent(applicationContext, VerificationCodeActivity::class.java)
            startActivity(intent)
        }
    }


}