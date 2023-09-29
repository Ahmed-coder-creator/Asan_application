package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    private lateinit var binding:ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var password=intent.getStringExtra("password")
        binding.conti.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            intent.putExtra("password",password)
            startActivity(intent)
            finish()
        }
    }
}