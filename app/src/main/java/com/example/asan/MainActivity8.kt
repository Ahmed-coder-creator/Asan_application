package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asan.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    private lateinit var binding:ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hinted8.text=intent.getStringExtra("username").toString()
        binding.hinted82.text=intent.getStringExtra("newpassword").toString()
        binding.conti.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            intent.putExtra("newpassword",binding.hinted82.text)
            intent.putExtra("username",binding.hinted8.text)
            startActivity(intent)
            finish()
        }
    }
}