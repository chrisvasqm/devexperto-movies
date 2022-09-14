package com.example.devexpertomovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.devexpertomovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonShow.setOnClickListener { onShowClicked() }
    }

    private fun onShowClicked() {
        val message = binding.editMessage.text
        if (message.isNotBlank())
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}