package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asan.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val accounts= arrayListOf<accountData>(
            accountData("InnoVol","12345678")
        )
        if (intent.getStringExtra("newpassword")!=null){
            for(i in accounts){
                accounts-=accountData(intent.getStringExtra("username").toString(),i.password)
            }
            accounts+=accountData(intent.getStringExtra("username").toString(),intent.getStringExtra("newpassword").toString())
        }
        if (intent.getStringExtra("usernameregister")!=null){
            accounts+=accountData(intent.getStringExtra("usernameregister").toString(),intent.getStringExtra("passwordregister").toString())
        }
        binding.backarrow.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }

        binding.forgot.setOnClickListener {
            val intent=Intent(this,MainActivity6::class.java)
            if (binding.username.text.toString().isNullOrEmpty()){
                binding.username.setError("Boş ola bilməz")
            }else{
                intent.putExtra("username",binding.username.text.toString())
                startActivity(intent)
                finish()
            }
        }
        binding.login.setOnClickListener {
            if (binding.username.text.toString().isNullOrEmpty()){
                binding.username.setError("Boş ola bilməz")
            }
            if (binding.password.text.toString().isNullOrEmpty()){
                binding.password.setError("Boş ola bilməz")
            }
            for(a in accounts){
                if(binding.username.text.toString()==a.username && binding.password.text.toString()==a.password){
                    val intent=Intent(this,MainActivity3::class.java)
                    startActivity(intent)
                    finish()
                    break
                }else if (binding.username.text.toString()!=a.username){
                    binding.username.setError("İstifadəçi adı doğru deyil")
                }else if (binding.password.text.toString()!=a.password){
                    binding.password.setError("Şifrə doğru  deyil")
                }
            }

        }
        binding.signup.setOnClickListener{
            val intent=Intent(this,MainActivity9::class.java)
            startActivity(intent)
            finish()
        }
    }
}