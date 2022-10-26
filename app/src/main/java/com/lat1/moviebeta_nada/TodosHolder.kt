package com.lat1.moviebeta_nada

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView

class TodosHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
    val tvTitle = itemview.findViewById<CheckBox>(R.id.cbox)
}