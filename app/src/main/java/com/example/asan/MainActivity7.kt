package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding:ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backarrow3.setOnClickListener {
            val intent=Intent(this,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.change.setOnClickListener {
            if(binding.create.text.toString().isNullOrEmpty()){
                binding.create.setError("Cannot be empty")
            }
            if(binding.confirm.text.toString().isNullOrEmpty()){
                binding.confirm.setError("Cannot be empty")
            }
            if(binding.create.text.toString()!=binding.confirm.text.toString()){
                binding.confirm.setError("Uncorrect confirm")
            }
            if (binding.create.text.toString().isNullOrEmpty()==false && binding.confirm.text.toString().isNullOrEmpty()==false && binding.create.text.toString()==binding.confirm.text.toString()){
                val intent=Intent(this,MainActivity8::class.java)
                intent.putExtra("password",binding.create.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}