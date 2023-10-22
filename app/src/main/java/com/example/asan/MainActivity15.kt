package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain15Binding

class MainActivity15 : AppCompatActivity() {
    private lateinit var binding:ActivityMain15Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain15Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.exammenu.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.homemenu.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.eventmenu.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.esassehifeye.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.imageView35.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
    }
}