package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
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
            if (binding.mobil.text.toString()[0]!='+'){
                binding.mobil.setError("Nömrənin formatı düzgün deyil")
            }
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
            when(binding.radioGroup.checkedRadioButtonId){
                R.id.radioButton2->{}
                R.id.radioButton3->{}
                else->{
                    Toast.makeText(this, "Cinsi seçin ", Toast.LENGTH_SHORT).show()
                }
            }
            if (binding.fin.text.toString().length<7 || binding.fin.text.toString().length>7){
                binding.fin.setError("FİN 7 simvoldan az və ya çox ola bilməz")
            }
            if(binding.ad.text.toString().isNullOrEmpty()==false && binding.fin.text.toString().isNullOrEmpty()==false && binding.mobil.text.toString().isNullOrEmpty()==false && binding.address.text.toString().isNullOrEmpty()==false && binding.radioGroup.checkedRadioButtonId==R.id.radioButton2 || binding.radioGroup.checkedRadioButtonId==R.id.radioButton3 && binding.fin.text.toString().length==7 && binding.mobil.text.toString()[0]== '+'){
                val intent = Intent(this, MainActivity15::class.java)
                startActivity(intent)
                finish()
            }

        }
        binding.imageView36.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
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