package com.lat1.moviebeta_nada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn1 = findViewById<Button>(R.id.button)


        btn1.setOnClickListener {
            val Pindah = Intent(this, MainActivity::class.java)
            startActivity(Pindah)
        }
    }
}