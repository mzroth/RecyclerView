package com.example.listMaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ListItemsRecyclerViewAdapter(var list: TaskList) : RecyclerView.Adapter<ListItemsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_items_view_holder, parent, false)
        return ListItemsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }

    override fun onBindViewHolder(holder: ListItemsViewHolder, position: Int) {
        holder.task.text = list.tasks[position]
    }
}