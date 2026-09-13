package com.example.instagramprofile

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PhotoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_photo)

        // =========================
        // TOMBOL KEMBALI
        // =========================

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
    }
}