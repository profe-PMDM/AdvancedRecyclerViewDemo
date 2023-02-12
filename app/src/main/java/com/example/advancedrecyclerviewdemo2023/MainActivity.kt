package com.example.advancedrecyclerviewdemo2023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.advancedrecyclerviewdemo2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adapter = NumberListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)

        adapter.submitList(IntRange(0,100).toList())

    }
}