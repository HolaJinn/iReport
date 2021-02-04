package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AdminNewPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_new_post)

        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val profileBtn = findViewById<ImageButton>(R.id.profileBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        exploreBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminFeedActivity::class.java)
            startActivity(intent)
        }

        profileBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminProfileActivity::class.java)
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
    }
}