package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AdminSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_settings)

        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)

        profileBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminProfileActivity::class.java)
            startActivity(intent)
        }

        newPostBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminNewPostActivity::class.java)
            startActivity(intent)
        }

        notificationBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminNotificationsActivity::class.java)
            startActivity(intent)
        }

        exploreBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminFeedActivity::class.java)
            startActivity(intent)
        }
    }
}