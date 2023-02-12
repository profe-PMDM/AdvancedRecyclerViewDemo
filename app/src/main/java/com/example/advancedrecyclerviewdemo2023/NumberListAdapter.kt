package com.example.advancedrecyclerviewdemo2023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class NumberListAdapter() :
    ListAdapter<Int,NumberListAdapter.IntViewHolder>(RowItemDiffCallback())  {

    class IntViewHolder(val row: View): RecyclerView.ViewHolder(row) {
        val textView: TextView = row.findViewById(R.id.number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return IntViewHolder(layout)
    }

    override fun onBindViewHolder(holder: IntViewHolder, position: Int) {
        holder.textView.text = getItem(position).toString()
    }
}

class RowItemDiffCallback : DiffUtil.ItemCallback<Int>() {

    override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
        return oldItem == newItem
    }
}

