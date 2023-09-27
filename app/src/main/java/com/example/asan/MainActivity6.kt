package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backarrow2.setOnClickListener {
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        binding.cont.setOnClickListener {
            if(binding.email.text.toString().isNullOrEmpty()){
                binding.email.setError("Cannot be empty")
            }else{
                val intent= Intent(this,MainActivity7::class.java)
                startActivity(intent)
            }

        }

    }
}