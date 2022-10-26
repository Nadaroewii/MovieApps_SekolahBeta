package com.lat1.moviebeta_nada.playlist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.R


class PlaylistHolder(itemview: View, val eventHandling: (Playlist) -> Unit): RecyclerView.ViewHolder(itemview) {
    private val cardImage : ImageView = itemView.findViewById(R.id.imageView)
    private val cardTitle : TextView = itemView.findViewById(R.id.textView)

    fun bindView(playlist: Playlist) {
        cardTitle.text = playlist.title
//        cardImage.setOnClickListener {
//            eventHandling(playlist)
//        }
        cardImage.setImageDrawable(
            ContextCompat.getDrawable(
                itemView.context,
                playlist.imgCover
            )
        )
//        cardImage.setImageDrawable(
//            ContextCompat.getDrawable(
//                itemView.context,
//                R.drawable.playy
//            )
//        )
    }
}