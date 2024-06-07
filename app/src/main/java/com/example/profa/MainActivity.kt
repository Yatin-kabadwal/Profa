package com.example.profa

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val camButton = findViewById<CardView>(R.id.camera)
        val profileButton = findViewById<CardView>(R.id.profile)
        val gitButton = findViewById<CardView>(R.id.git)

        camButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        profileButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("http://www.linkedin.com/in/yatin-173-kabadwal")
            startActivity(intent)
        }


        gitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Yatin-kabadwal")
            startActivity(intent)
        }
    }
}