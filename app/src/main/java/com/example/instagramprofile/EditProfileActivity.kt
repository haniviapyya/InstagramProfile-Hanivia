package com.example.instagramprofile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_BIO = "extra_bio"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtBio = findViewById<EditText>(R.id.edtBio)
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Menampilkan data nama dan bio sebelumnya
        edtName.setText(intent.getStringExtra(EXTRA_NAME))
        edtBio.setText(intent.getStringExtra(EXTRA_BIO))

        // Tombol Simpan
        btnSave.setOnClickListener {

            val resultIntent = Intent()

            resultIntent.putExtra(
                EXTRA_NAME,
                edtName.text.toString()
            )

            resultIntent.putExtra(
                EXTRA_BIO,
                edtBio.text.toString()
            )

            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }
    }
}