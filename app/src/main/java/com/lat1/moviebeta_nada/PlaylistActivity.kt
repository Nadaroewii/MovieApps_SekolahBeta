package com.lat1.moviebeta_nada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lat1.moviebeta_nada.playlist.Playlist
import com.lat1.moviebeta_nada.playlist.PlaylistItemAdapter

class PlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Playlist Favorite")
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        var bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navv)

        val listOfPlaylist = arrayListOf<Playlist>()
        listOfPlaylist.add(Playlist("Stranger Things 4", "Keluarga Byers yang terdiri dari Joyce bersama kedua anaknya, Will dan Jonathan beserta Eleven alias Jane Hopper sekarang tinggal di California.", "2022 ∙ Drama Horor Fiksi","4 Season ∙ 10 Episode ∙ 14+","Dibintangi: Millie Bobby Brown, Finn Wolfhard, Gaten Matarazzo", R.drawable.poster3,R.drawable.film3 ))
        listOfPlaylist.add(Playlist("Sri Asih", "Alana tidak mengerti mengapa dia selalu dikuasai oleh kemarahan. Tapi dia selalu berusaha untuk melawannya. Dia bukan manusia biasa.", "2022 ∙ Film Aksi", "Film ∙ 13+","Dibintangi: Pevita Pearce, Jefri Nichol, Raline Shah", R.drawable.poster4,R.drawable.film8 ))
        listOfPlaylist.add(Playlist("Thor Love&Thunder", "Thor dalam perjalanan pencariankedamaian batin. Masa pensiunnya terganggu oleh seorang pembunuh galaksi dikenal sebagai Gorr sang Dewa Jagal.", "2022 ∙ Film Fantasi, Pahlawan Super", "Film ∙ 13+","Dibintangi: Chris Hemsworth, Christian Bale, Natalie Portman", R.drawable.poster5,R.drawable.film5 ))
        listOfPlaylist.add(Playlist("She Hulk", "Jennifer Walters adalah seorang pengacara yang berfokus pada kasus hukum para manusia super. Ia sosok perempuan karier memiliki keluarga cukup rumit. ", "2022 ∙ Marvel Superhero", "1 Season ∙ 8 Episode ∙ 13+","Dibintangi: Tatiana Maslany, Jameela Jamil, Ginger Gonzaga", R.drawable.poster6,R.drawable.film9 ))
        listOfPlaylist.add(Playlist("Everything Everyone All at Once", "Seorang imigran Tiongkok terbawa dalam petualangan luar biasa, dia sendiri yang dapat menyelamatkan dunia dengan menjelajahi alam semesta lain.", "2022 ∙ Film Komedi, Petualangan","Film ∙ 14+","Dibintangi: Michelle Yeoh, Stephanie Hsu, Jamie Lee Curtis", R.drawable.poster7,R.drawable.film10 ))
        listOfPlaylist.add(Playlist("Pengabdi Setan 2", "Beberapa tahun setelah berhasil menyelamatkan diri dari kejadian mengerikan, Rini dan adik-adiknya, Toni dan Bondi, serta Bapak tinggal di rumah susun.","2022 ∙ Film Horor","Film ∙ 13+","Dibintangi: Ratu Felisha, Tara Basro, Ayu Laksmi", R.drawable.poster8,R.drawable.film11 ))
        listOfPlaylist.add(Playlist("Stranger Things 4", "Keluarga Byers yang terdiri dari Joyce bersama kedua anaknya, Will dan Jonathan beserta Eleven alias Jane Hopper sekarang tinggal di California.", "2022 ∙ Drama Horor Fiksi","4 Season ∙ 10 Episode ∙ 14+","Dibintangi: Millie Bobby Brown, Finn Wolfhard, Gaten Matarazzo", R.drawable.poster3,R.drawable.film3 ))
        listOfPlaylist.add(Playlist("Sri Asih", "Alana tidak mengerti mengapa dia selalu dikuasai oleh kemarahan. Tapi dia selalu berusaha untuk melawannya.", "2022 ∙ Film Aksi", "Film ∙ 13+","Dibintangi: Pevita Pearce, Jefri Nichol, Raline Shah", R.drawable.poster4,R.drawable.film8 ))
        listOfPlaylist.add(Playlist("Thor Love&Thunder", "Thor dalam perjalanan pencariankedamaian batin. Masa pensiunnya terganggu oleh seorang pembunuh galaksi dikenal sebagai Gorr sang Dewa Jagal.", "2022 ∙ Film Fantasi, Pahlawan Super", "Film ∙ 13+","Dibintangi: Chris Hemsworth, Christian Bale, Natalie Portman", R.drawable.poster5,R.drawable.film5 ))
        listOfPlaylist.add(Playlist("She Hulk", "Jennifer Walters adalah seorang pengacara yang berfokus pada kasus hukum para manusia super. Ia sosok perempuan karier memiliki keluarga cukup rumit. ", "2022 ∙ Marvel Superhero", "1 Season ∙ 8 Episode ∙ 13+","Dibintangi: Tatiana Maslany, Jameela Jamil, Ginger Gonzaga", R.drawable.poster6,R.drawable.film9 ))
        listOfPlaylist.add(Playlist("Everything Everyone All at Once", "Seorang imigran Tiongkok terbawa dalam petualangan luar biasa, dia sendiri yang dapat menyelamatkan dunia dengan menjelajahi alam semesta lain.", "2022 ∙ Film Komedi, Petualangan","Film ∙ 14+","Dibintangi: Michelle Yeoh, Stephanie Hsu, Jamie Lee Curtis", R.drawable.poster7,R.drawable.film10 ))
        listOfPlaylist.add(Playlist("Pengabdi Setan 2", "Beberapa tahun setelah berhasil menyelamatkan diri dari kejadian mengerikan, Rini dan adik-adiknya, Toni dan Bondi, serta Bapak tinggal di rumah susun.","2022 ∙ Film Horor","Film ∙ 13+","Dibintangi: Ratu Felisha, Tara Basro, Ayu Laksmi", R.drawable.poster8,R.drawable.film11 ))

        val rvPlaylist = findViewById<RecyclerView>(R.id.gridItems)
        val rvPlaylistAdapter = PlaylistItemAdapter{ myData ->
            Intent(this, FilmActivity::class.java).apply {
                putExtra("playlist", myData)
                startActivity(this)
            }
        }
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            item.isChecked = true
            selectFragment(item)
            false
        }
//            Toast.makeText(this, "Clicked ${it.title}", Toast.LENGTH_SHORT).show()

        rvPlaylist.adapter = rvPlaylistAdapter
        rvPlaylistAdapter.setNewItem(listOfPlaylist)
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