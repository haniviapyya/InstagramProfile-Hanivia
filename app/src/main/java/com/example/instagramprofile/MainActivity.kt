package com.example.instagramprofile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editProfileLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // =========================
        // DATA NAMA DAN BIO
        // =========================

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtBio = findViewById<TextView>(R.id.txtBio)


        // =========================
        // LAUNCHER EDIT PROFILE
        // =========================

        editProfileLauncher =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult()
            ) { result ->

                if (result.resultCode == Activity.RESULT_OK) {

                    val data = result.data

                    val name =
                        data?.getStringExtra(EditProfileActivity.EXTRA_NAME)

                    val bio =
                        data?.getStringExtra(EditProfileActivity.EXTRA_BIO)

                    if (name != null) {
                        txtName.text = name
                    }

                    if (bio != null) {
                        txtBio.text = bio
                    }
                }
            }


        // =========================
        // EDIT PROFILE
        // =========================

        val btnEdit = findViewById<Button>(R.id.btnEdit)

        btnEdit.setOnClickListener {

            val intent = Intent(
                this@MainActivity,
                EditProfileActivity::class.java
            )

            intent.putExtra(
                EditProfileActivity.EXTRA_NAME,
                txtName.text.toString()
            )

            intent.putExtra(
                EditProfileActivity.EXTRA_BIO,
                txtBio.text.toString()
            )

            editProfileLauncher.launch(intent)
        }


        // =========================
        // FOTO PROFIL
        // =========================

        val profileImage = findViewById<ImageView>(R.id.profileImage)

        profileImage.setOnClickListener {

            val intent = Intent(
                this@MainActivity,
                PhotoActivity::class.java
            )

            startActivity(intent)
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