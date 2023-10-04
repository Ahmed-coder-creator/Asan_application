package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val username="InnoVol"
        var password="12345678"
        if (intent.getStringExtra("password").isNullOrEmpty()==false){
            password=intent.getStringExtra("password").toString()
        }
        binding.backarrow.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.forgot.setOnClickListener {
            val intent=Intent(this,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.login.setOnClickListener {
            if (binding.username.text.toString().isNullOrEmpty()){
                binding.username.setError("Cannot be empty")
            }
            if (binding.password.text.toString().isNullOrEmpty()){
                binding.password.setError("Cannot be empty")
            }
            if(binding.username.text.toString()==username && binding.password.text.toString()==password){
                val intent=Intent(this,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
            if(binding.username.text.toString()!=username){
                binding.username.setError("Username is uncorrect")
            }
            if(binding.password.text.toString()!=password){
                binding.password.setError("Password is uncorrect")
            }
        }
        binding.signup.setOnClickListener{
            val intent=Intent(this,MainActivity9::class.java)
            startActivity(intent)
            finish()
        }
    }
}