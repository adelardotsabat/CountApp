package com.example.countapp

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding

// bikin variabel untuk binding
private lateinit var binding: ActivityMainBinding
var counter = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        // sekarang
        with(receiver = binding) {
            tvNumber.text = counter.toString()

            btnCount.setOnClickListener {
                counter++
                tvNumber.text = counter.toString()
            }
            btnToast.setOnClickListener {
                Toast
                    .makeText(
                        this@MainActivity,
                        "Counter: $counter",
                        Toast.LENGTH_SHORT
                    )
                    .show()
            }


        }
    }
}