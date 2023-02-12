package com.example.advancedrecyclerviewdemo2023

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.advancedrecyclerviewdemo2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adapter = NumberListAdapter(MyListener { num ->
        Toast.makeText(this,
            "El número seleccionado es el ${num}",
            Toast.LENGTH_LONG)
            .show()
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this)

        adapter.submitList(IntRange(0,100).toList())

    }
}