package com.lat1.moviebeta_nada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var film1 = findViewById<ImageView>(R.id.film1)
        var bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navv)

        film1.setOnClickListener {
            val Pindah = Intent(this, Detail1Activity::class.java)
            startActivity(Pindah)
        }
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            item.isChecked = true
            selectFragment(item)
            false
        }
    }
    private fun selectFragment(item: MenuItem?) {
        item?.isChecked = true
        when (item?.itemId) {
            R.id.home -> {
                val Pindah = Intent(this, MainActivity::class.java)
                startActivity(Pindah)
            } R.id.favorit -> {
            val Pindah = Intent(this, PlaylistActivity::class.java)
            startActivity(Pindah)
        }
        }
    }
}