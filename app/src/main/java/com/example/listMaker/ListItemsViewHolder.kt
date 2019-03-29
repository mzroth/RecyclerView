package com.example.listMaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val task: TextView = itemView.findViewById(R.id.textView_task)
}