package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asan.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hinted6.text=intent.getStringExtra("username").toString()
        binding.backarrow2.setOnClickListener {
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.cont.setOnClickListener {
            if(binding.email.text.toString().isNullOrEmpty()){
                binding.email.setError("Boş ola bilməz")
            }else{
                if (binding.email.text.toString()==intent.getStringExtra("email")){
                    val intent = Intent(this, MainActivity7::class.java)
                    intent.putExtra("username6",binding.hinted6.text)
                    startActivity(intent)
                    finish()
                }else{
                    binding.email.setError("E-poçt ünvanı düzgün deyil")
                }
            }

            }

        }

    }