package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class AdminFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_feed)

        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        val imagePost = findViewById<ImageView>(R.id.imagePostId)

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

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminSettingsActivity::class.java)
            startActivity(intent)
        }

        imagePost.setOnClickListener {
            intent = Intent(applicationContext, AdminPostActivity::class.java)
            startActivity(intent)
        }
    }
}