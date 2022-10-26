package com.lat1.moviebeta_nada.history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.history.ProductsItem
import com.lat1.moviebeta_nada.R


class HistoryListAdapter(): RecyclerView.Adapter<HistoryListHolder>() {
//    private val dataset = arrayListOf<History>()
        private val dataset = arrayListOf<ProductsItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryListHolder {
        return HistoryListHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.history_holder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HistoryListHolder, position: Int) { //untuk menempelkan textview dll komponen
        holder.bindView(dataset[position])
    }

    override fun getItemCount():
            Int = dataset.size

    fun setNewItem(newDataset: ArrayList<ProductsItem>) {
        dataset.clear()
        dataset.addAll(newDataset)
        //dataset.addAll(newDataset)
        this.notifyDataSetChanged()
    }

}