package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.haqqimizda.setOnClickListener {
            binding.haqqimizda.setImageResource(R.drawable.haqqimizdamavi)
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        binding.tedbirler.setOnClickListener {
            binding.tedbirler.setImageResource(R.drawable.tedbirlermavi)
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        binding.sexsikabinet.setOnClickListener {
            binding.sexsikabinet.setImageResource(R.drawable.shexsimavi)
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        binding.imtahanlar.setOnClickListener {
            binding.imtahanlar.setImageResource(R.drawable.imtahanlarmavi)
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }
        binding.muraciyet.setOnClickListener {
            binding.muraciyet.setImageResource(R.drawable.muraciyyetmavi)
            val intent=Intent(this,MainActivity14::class.java)
            startActivity(intent)
        }
        binding.sohbetler.setOnClickListener {
            binding.sohbetler.setImageResource(R.drawable.sohbetlermavi)
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
        }

    }
}