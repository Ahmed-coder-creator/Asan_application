package com.example.asan

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.asan.databinding.ActivityMain19Binding

class MainActivity19 : AppCompatActivity() {
    private lateinit var binding: ActivityMain19Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain19Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val days31= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
        val months= arrayListOf<String>("Yanvar","Fevral","Mart","Aprel","May","İyun","İyul","Avqust","Sentyabr","Oktyabr","Noyabr","Dekabr")
        val years= arrayListOf<Int>(1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007)
        val birthplace= arrayListOf<String>("Azərbaycan","Türkiyə","Gürcüstan","Rusiya Federasiyası","Tacikistan","Çin")
        val spinner3=binding.spinner3
        val arrayAdapter31= ArrayAdapter<Int>(this, R.layout.simple_spinner_dropdown_item,days31)
        spinner3.adapter=arrayAdapter31
        val spinner4=binding.spinner4
        val arrayAdapter4=ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,months)
        spinner4.adapter=arrayAdapter4
        val spinner5=binding.spinner5
        val arrayAdapter5=ArrayAdapter<Int>(this,android.R.layout.simple_spinner_dropdown_item,years)
        spinner5.adapter=arrayAdapter5
        val spinner6=binding.spinner6
        val arrayAdapter6=ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,birthplace)
        spinner6.adapter=arrayAdapter6
        binding.eventmenu.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.homemenu.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.backtohomepage.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.menuselectbox.setOnClickListener {
            binding.elageinfo.visibility=View.VISIBLE
            binding.menuselectbox.visibility=View.INVISIBLE
            binding.selectmenuboxbutton.visibility=View.VISIBLE
        }
        binding.selectmenuboxbutton.setOnClickListener {
            binding.elageinfo.visibility=View.INVISIBLE
            binding.menuselectbox.visibility=View.VISIBLE
            binding.selectmenuboxbutton.visibility=View.INVISIBLE
        }
        binding.elageinfo.setOnClickListener {
            val intent=Intent(this,MainActivity20::class.java)
            startActivity(intent)
            finish()
        }

    }
}