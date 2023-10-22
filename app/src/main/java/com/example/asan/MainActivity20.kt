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
        binding.lagvet.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.hamburger2.setOnClickListener {
            binding.hamburgerlayout.visibility=View.VISIBLE
        }
        binding.hamburgerclose.setOnClickListener {
            binding.hamburgerlayout.visibility=View.INVISIBLE
        }
        binding.shexsi.setOnClickListener {
            val intent=Intent(this,MainActivity19::class.java)
            startActivity(intent)
            finish()
        }
        binding.exitmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.elaqe.setOnClickListener {
            val intent=Intent(this,MainActivity20::class.java)
            startActivity(intent)
            finish()
        }
        binding.yaddasaxla.setOnClickListener {
            if (binding.mobile.text.isNullOrEmpty()){
                binding.mobile.setError("Boş ola bilməz")
            }
            if (binding.email.text.isNullOrEmpty()){
                binding.email.setError("Boş ola bilməz")
            }
            if (binding.yasayis.text.isNullOrEmpty()){
                binding.yasayis.setError("Boş ola bilməz")
            }
            if (binding.qeydiyyat.text.isNullOrEmpty()){
                binding.qeydiyyat.setError("Boş ola bilməz")
            }
            if("+" !in binding.mobile.text.toString()){
                binding.mobile.setError("Nömrənin formatı düzgün deyil")
            }
            if(binding.mobile.text.isNullOrEmpty()==false && binding.email.text.isNullOrEmpty()==false && binding.yasayis.text.isNullOrEmpty()==false && binding.qeydiyyat.text.isNullOrEmpty()==false && "+" in binding.mobile.text.toString()){
                val intent=Intent(this,MainActivity3::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}