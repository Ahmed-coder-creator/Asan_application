package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain9Binding

class MainActivity9 : AppCompatActivity() {
    private lateinit var binding: ActivityMain9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signupbutton.setOnClickListener {
            if (binding.username.text.toString().isNullOrEmpty()){
                binding.username.setError("Cannot be empty")
            }
            if (binding.email.text.toString().isNullOrEmpty()){
                binding.email.setError("Cannot be empty")
            }
            if (binding.password.text.toString().isNullOrEmpty()){
                binding.password.setError("Cannot be empty")
            }
            if (binding.confirmpassword.text.toString().isNullOrEmpty()){
                binding.confirmpassword.setError("Cannot be empty")
            }
            if(binding.password.text.toString()!=binding.confirmpassword.text.toString()){
                binding.confirmpassword.setError("Uncorrect confirm")
            }
            if(binding.username.text.toString().isNullOrEmpty()==false && binding.email.text.toString().isNullOrEmpty()==false &&binding.password.text.toString().isNullOrEmpty()==false && binding.confirmpassword.text.toString().isNullOrEmpty() && binding.password.text.toString()==binding.confirmpassword.text.toString()){
                val intent=Intent(this,MainActivity5::class.java)
                startActivity(intent)
                finish()
            }
        }
        binding.imageView12.setOnClickListener {
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
            finish()
        }
    }
}