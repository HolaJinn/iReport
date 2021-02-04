package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class NewPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_post)

        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        exploreBtn.setOnClickListener {
            intent = Intent(applicationContext, FeedActivity::class.java)
            startActivity(intent)
        }

        profileBtn.setOnClickListener {
            intent = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(intent)
        }

        notificationBtn.setOnClickListener {
            intent = Intent(applicationContext, NotificationsActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}