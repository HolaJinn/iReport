package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class AdminProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_profile)

        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        val postImage = findViewById<ImageView>(R.id.imagePostId)

        exploreBtn.setOnClickListener{
            intent = Intent(applicationContext, AdminFeedActivity::class.java)
            startActivity(intent)
        }

        newPostBtn.setOnClickListener{
            intent = Intent(applicationContext, AdminNewPostActivity::class.java)
            startActivity(intent)
        }

        notificationBtn.setOnClickListener{
            intent = Intent(applicationContext, AdminNotificationsActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, AdminSettingsActivity::class.java)
            startActivity(intent)
        }

        postImage.setOnClickListener {
            intent = Intent(applicationContext, AdminPostActivity::class.java)
            startActivity(intent)
        }
    }
}