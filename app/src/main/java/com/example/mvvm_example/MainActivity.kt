package com.example.mvvm_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_example.databinding.ActivityMainBinding
import com.example.mvvm_example.view.NameViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //private val viewModel: NameViewModel by viewModels()
    private lateinit var viewModel: NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[NameViewModel::class.java]
    }
}