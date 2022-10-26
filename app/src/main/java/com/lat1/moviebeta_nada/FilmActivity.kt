package com.lat1.moviebeta_nada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lat1.moviebeta_nada.playlist.Playlist
import org.w3c.dom.Text

class FilmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film1)

        //val playlist = intent.getParcelableExtra<Playlist>("playlist")
//        val imgPoster = findViewById<LinearLayout>(R.id.ln_lay)
//        val title = findViewById<TextView>(R.id.textView1)
//        val imgCover = findViewById<ImageView>(R.id.film1)
//        val genre = findViewById<TextView>(R.id.textView2)
//        val season = findViewById<TextView>(R.id.textView3)
//        val detail = findViewById<TextView>(R.id.textView7)
//        val aktor = findViewById<TextView>(R.id.textView8)
//        var bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navv)
//        var back = findViewById<ImageView>(R.id.logo)
//
//        title.text = playlist?.title
//        genre.text = playlist?.genre
//        season.text = playlist?.season
//        detail.text = playlist?.detail
//        aktor.text = playlist?.aktor
//        imgPoster.setBackgroundResource(playlist?.imgPoster!!)
//        imgCover.setImageResource(playlist?.imgCover!!)
//
//        bottom_navigation.setOnNavigationItemSelectedListener { item ->
//            item.isChecked = true
//            selectFragment(item)
//            false
//        }
//        back.setOnClickListener {
//            val Pindah = Intent(this, Detail1Activity::class.java)
//            startActivity(Pindah)
//        }
//    }
//    private fun selectFragment(item: MenuItem?) {
//        item?.isChecked = true
//        when (item?.itemId) {
//            R.id.home -> {
//                val Pindah = Intent(this, MainActivity::class.java)
//                startActivity(Pindah)
//            } R.id.favorit -> {
//            val Pindah = Intent(this, PlaylistActivity::class.java)
//            startActivity(Pindah)
//            }
//        }
    }


}