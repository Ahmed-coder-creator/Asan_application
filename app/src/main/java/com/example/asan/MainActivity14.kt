package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.asan.databinding.ActivityMain14Binding

class MainActivity14 : AppCompatActivity() {
    private lateinit var binding:ActivityMain14Binding
    val patronymic= arrayListOf<String>("Azərbaycan","Türk","Rus","İngilis","İspan","Gürcustan","Pakistan","ABŞ")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain14Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.exammenu.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.homemenu.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.eventmenu.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.geriimg.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.geritext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
        binding.muraciyetet.setOnClickListener {
            if (binding.ad.text.toString().isNullOrEmpty()){
                binding.ad.setError("Boş ola bilməz")
            }
            if (binding.fin.text.toString().isNullOrEmpty()){
                binding.fin.setError("Boş ola bilməz")
            }
            if (binding.mobil.text.toString().isNullOrEmpty()){
                binding.mobil.setError("Boş ola bilməz")
            }
            if (binding.address.text.toString().isNullOrEmpty()){
                binding.address.setError("Boş ola bilməz")
            }
            if(binding.ad.text.toString().isNullOrEmpty()==false && binding.fin.text.toString().isNullOrEmpty()==false && binding.mobil.text.toString().isNullOrEmpty()==false && binding.address.text.toString().isNullOrEmpty()==false){
                val intent = Intent(this, MainActivity15::class.java)
                startActivity(intent)
                finish()
            }
        }
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        val spinner=binding.spinner
        val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,patronymic)
        spinner.adapter=arrayAdapter
    }
}