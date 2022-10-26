package com.lat1.moviebeta_nada.playlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.R

class PlaylistItemAdapter(
    private val eventHandling: (Playlist) -> Unit) :
    RecyclerView.Adapter<PlaylistHolder>() {
    private val dataset = arrayListOf<Playlist>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistHolder =
        PlaylistHolder (
        LayoutInflater.from(parent.context)
            .inflate(R.layout.playlist_view, parent, false), eventHandling
        )


    override fun onBindViewHolder(holder: PlaylistHolder, position: Int) {
        holder.bindView(dataset[position])
        holder.itemView.setOnClickListener{
            eventHandling(dataset[position])
//            Toast.makeText(holder.itemView.context, "Clicked ${dataset[position].title}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount():
        Int = dataset.size

    fun setNewItem(newDataset: ArrayList<Playlist>) {
        dataset.clear()
        dataset.addAll(newDataset)
        //dataset.addAll(newDataset)
        this.notifyDataSetChanged()
    }
}