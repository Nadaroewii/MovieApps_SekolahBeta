package com.lat1.moviebeta_nada

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lat1.moviebeta_nada.data.TodosItem
import com.lat1.moviebeta_nada.data.TodosList
import com.lat1.moviebeta_nada.history.ProductsItem

class TodosAdapter : RecyclerView.Adapter<TodosHolder>() {

    val TodoList : MutableList<TodosItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return TodosHolder(view)
    }

    override fun onBindViewHolder(holder: TodosHolder, position: Int) {
        val data = TodoList[position]
        holder.tvTitle.text = data.todo
        holder.tvTitle.isChecked = data.completed ?: false

    }

    override fun getItemCount(): Int {
        return TodoList.size
    }

    fun setNewItem(newDataset: List<TodosItem>) {
        TodoList.clear()
        TodoList.addAll(newDataset)
        this.notifyDataSetChanged()
    }
}