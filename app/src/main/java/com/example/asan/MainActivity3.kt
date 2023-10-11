package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.asan.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.konullu.setOnClickListener {
            binding.imageView5.setImageResource(R.drawable.asanxidmetinfounactive)
            binding.konullu.setImageResource(R.drawable.akinfoactive)
            binding.scrollView2.visibility=View.INVISIBLE
            binding.scrolkonullu.visibility=View.VISIBLE
        }
        binding.imageView5.setOnClickListener {
            binding.imageView5.setImageResource(R.drawable.asanxidmatinfoactive)
            binding.konullu.setImageResource(R.drawable.konullu)
            binding.scrollView2.visibility=View.VISIBLE
            binding.scrolkonullu.visibility=View.INVISIBLE
        }
        binding.back.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.eventmenu.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.hamburger.setOnClickListener {
            binding.hamburgerlayout.visibility=View.VISIBLE
        }
        binding.hamburgerclose.setOnClickListener {
            binding.hamburgerlayout.visibility=View.INVISIBLE
        }
        binding.shexsi.setOnClickListener {
            val intent=Intent(this,MainActivity19::class.java)
            startActivity(intent)
        }
        binding.exitmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
    }
}