package com.lat1.moviebeta_nada.history

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.history.ProductsItem
import com.lat1.moviebeta_nada.R
import com.squareup.picasso.Picasso


class HistoryListHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
    val tvTitle = itemview.findViewById<TextView>(R.id.tv_title)
    val ivCover = itemview.findViewById<ImageView>(R.id.iv_cover)

    fun bindView(history: ProductsItem) {
        tvTitle.text = history.title
        Picasso
            .get()
            .load(history.thumbnail).into(ivCover)
//        ivCover.setImageDrawable(
//            ContextCompat.getDrawable(
//                itemView.context,
//                history.imgCover
//            )
//        )
    }
}