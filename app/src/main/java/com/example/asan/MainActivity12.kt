package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain12Binding

class MainActivity12 : AppCompatActivity() {
    private lateinit var binding:ActivityMain12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain12Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backarrowexamtimesubmit.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.geriye.setOnClickListener {
            val intent= Intent(this,MainActivity11::class.java)
            startActivity(intent)
            finish()
        }
        binding.imtahanvaxti.text=intent.getStringExtra("vaxt")
        binding.exammenu.setOnClickListener {
            val intent= Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.homemenu.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.eventmenu.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }
}