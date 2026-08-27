package com.example.countapp

import android.os.Binder
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding

// bikim variabel untuk binding
private lateinit var binding: ActivityMainBinding
private var number = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        // sekarang
        with(receiver = binding) {


        }
    }
}