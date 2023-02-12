package com.example.advancedrecyclerviewdemo2023

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("base2Number")
fun TextView.setBase2Number(item: Int) {
    text = Integer.toBinaryString(item)
}