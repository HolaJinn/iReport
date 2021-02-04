package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        profileBtn.setOnClickListener {
            intent = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(intent)
        }

        newPostBtn.setOnClickListener {
            intent = Intent(applicationContext, NewPostActivity::class.java)
            startActivity(intent)
        }

        exploreBtn.setOnClickListener {
            intent = Intent(applicationContext, FeedActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}