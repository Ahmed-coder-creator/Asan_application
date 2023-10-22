package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asan.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding:ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hinted.text=intent.getStringExtra("username6").toString()
        binding.backarrow3.setOnClickListener {
            val intent=Intent(this,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.change.setOnClickListener {
            if(binding.create.text.toString().isNullOrEmpty()){
                binding.create.setError("Boş ola bilməz")
            }
            if(binding.confirm.text.toString().isNullOrEmpty()){
                binding.confirm.setError("Boş ola bilməz")
            }
            if(binding.create.text.toString()!=binding.confirm.text.toString()){
                binding.confirm.setError("Şifrənin təkrarı doğru deyil")
            }
            if (binding.create.text.toString().length<8){
                binding.create.setError("Şifrənin uzunluğu 8 simvoldan az ola bilməz")
            }
            if (binding.create.text.toString().isNullOrEmpty()==false && binding.confirm.text.toString().isNullOrEmpty()==false && binding.create.text.toString()==binding.confirm.text.toString() && binding.create.text.toString().length>=8){
                val intent=Intent(this,MainActivity8::class.java)
                intent.putExtra("newpassword",binding.create.text.toString())
                intent.putExtra("username",binding.hinted.text)
                startActivity(intent)
                finish()
            }
        }

    }
}