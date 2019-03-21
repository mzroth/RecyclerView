package com.example.listMaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition = itemView.findViewById<TextView>(R.id.item_number) as TextView
    val listTitle: TextView = itemView.findViewById<TextView>(R.id.item_string)
}