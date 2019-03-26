package com.example.listMaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition: TextView = itemView.findViewById(R.id.item_number)
    val listTitle: TextView = itemView.findViewById(R.id.item_string)
}