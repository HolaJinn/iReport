package com.example.ireport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val exploreBtn = findViewById<ImageButton>(R.id.exploreBtn)
        val notificationBtn = findViewById<ImageButton>(R.id.notificationsBtn)
        val newPostBtn = findViewById<ImageButton>(R.id.newPostBtn)
        val settingsBtn = findViewById<ImageButton>(R.id.settingsBtn)

        val postImage = findViewById<ImageView>(R.id.imagePostId)

        exploreBtn.setOnClickListener{
            intent = Intent(applicationContext, FeedActivity::class.java)
            startActivity(intent)
        }

        newPostBtn.setOnClickListener{
            intent = Intent(applicationContext, NewPostActivity::class.java)
            startActivity(intent)
        }

        notificationBtn.setOnClickListener{
            intent = Intent(applicationContext, NotificationsActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            intent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(intent)
        }

        postImage.setOnClickListener {
            intent = Intent(applicationContext, PostActivity::class.java)
            startActivity(intent)
        }
    }
}