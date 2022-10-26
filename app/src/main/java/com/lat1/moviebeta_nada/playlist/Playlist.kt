package com.lat1.moviebeta_nada.playlist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Playlist (
    val title: String,
    val detail: String,
    val genre: String,
    val season: String,
    val aktor:String,
    val imgPoster: Int,
    val imgCover: Int) : Parcelable