package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AdminNotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_notifications)

        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        profileBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminProfileActivity::class.java)
            startActivity(intent)
        }

        newPostBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminNewPostActivity::class.java)
            startActivity(intent)
        }

        exploreBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminFeedActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminSettingsActivity::class.java)
            startActivity(intent)
        }
    }
}