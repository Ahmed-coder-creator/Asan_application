package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain10Binding

class MainActivity10 : AppCompatActivity() {
    private lateinit var binding: ActivityMain10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backarrowexam.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.eventmenu.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.imtahantarixleri.setOnClickListener {
            val intent= Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }
        binding.homemenu.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.imtahancavablari.setOnClickListener {
            val intent=Intent(this,MainActivity13::class.java)
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