package com.victor.mvvmdemoapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.victor.mvvmdemoapp.R
import com.victor.mvvmdemoapp.databinding.ActivityMainBinding
import com.victor.mvvmdemoapp.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.data.observe(this) { newText ->
            binding.textView.text = newText
        }
        binding.button.setOnClickListener {
            mainViewModel.updateData("Hey Victor....")
        }
    }
}