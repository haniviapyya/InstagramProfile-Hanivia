package com.example.instagramprofile

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // =========================
        // EDIT PROFILE
        // =========================

        val btnEdit = findViewById<Button>(R.id.btnEdit)

        btnEdit.setOnClickListener {

            Toast.makeText(
                this,
                "Edit Profile dipilih",
                Toast.LENGTH_SHORT
            ).show()

        }


        // =========================
        // SHARE PROFILE
        // =========================

        val btnShare = findViewById<Button>(R.id.btnShare)

        btnShare.setOnClickListener {

            Toast.makeText(
                this,
                "Profile berhasil dibagikan!",
                Toast.LENGTH_SHORT
            ).show()

        }


        // =========================
        // LIKE POST
        // =========================

        val postLike = findViewById<ImageView>(R.id.postLike)

        postLike.setOnClickListener {

            Toast.makeText(
                this,
                "You liked this post ❤️",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}