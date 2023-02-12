package com.example.advancedrecyclerviewdemo2023

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.advancedrecyclerviewdemo2023.databinding.ItemViewBinding

class NumberListAdapter(val clickListener: MyListener) :
    ListAdapter<Int,NumberListAdapter.IntViewHolder>(RowItemDiffCallback())  {

    class IntViewHolder (val binding: ItemViewBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(layoutInflater, parent, false)
        return IntViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IntViewHolder, position: Int) {
        val number = getItem(position)
        holder.binding.num = number
        holder.binding.clickListener = clickListener
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

class MyListener(val clickListener: (num: Int) -> Unit) {
    fun onClick(num: Int) = clickListener(num)
}

