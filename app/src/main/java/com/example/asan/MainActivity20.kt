package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.asan.databinding.ActivityMain20Binding

class MainActivity20 : AppCompatActivity() {
    private lateinit var binding: ActivityMain20Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain20Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.eventmenu.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent= Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.searchmenu.setOnClickListener {
            val intent= Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.homemenu.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.backtohomepage4.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.menuselectbox3.setOnClickListener {
            binding.elageinfo2.visibility= View.VISIBLE
            binding.menuselectbox3.visibility= View.INVISIBLE
            binding.selectmenuboxbutton2.visibility= View.VISIBLE
        }
        binding.selectmenuboxbutton2.setOnClickListener {
            binding.elageinfo2.visibility= View.INVISIBLE
            binding.menuselectbox3.visibility= View.VISIBLE
            binding.selectmenuboxbutton2.visibility= View.INVISIBLE
        }
        binding.elageinfo2.setOnClickListener {
            val intent=Intent(this,MainActivity19::class.java)
            startActivity(intent)
            finish()
        }
    }
}