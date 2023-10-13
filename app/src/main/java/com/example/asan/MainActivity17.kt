package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asan.databinding.ActivityMain17Binding

class MainActivity17 : AppCompatActivity() {
    private lateinit var binding:ActivityMain17Binding
    private val adapter=MessageAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         var message= arrayListOf<MessagesData>(
            MessagesData("Salam.Necəsən?","12:28",false),
            MessagesData("Salam yaxşıyam.Sən necəsən?","12:28",true),
            MessagesData("Həll edə bildin problemi","12:28",false),
            MessagesData("Hə düzəltdim.Çox sağol","12:28",true),
            MessagesData("Nə yaxşı.Təbrik edirəm.","12:28",false),
            MessagesData("Minnətdaram","12:29",true)
        )
        binding= ActivityMain17Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.namechatinside.text=intent.getStringExtra("name")
        binding.lastseenchatsinside.text=intent.getStringExtra("lastseen")
        binding.profileimgchatsinside.setImageResource(intent.getIntExtra("profile",0))
        binding.exit.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
        }
        binding.sent.setOnClickListener {
            if(binding.mesajlar.text.toString()=="Salam"){
                message+=MessagesData(binding.mesajlar.text.toString(),"00:00",true)
                binding.rvMesssages.adapter=adapter
                adapter.updateAdapter(message)
                binding.mesajlar.setText("")
                message+=MessagesData("Salam","00:00",false)
                binding.rvMesssages.adapter=adapter
                adapter.updateAdapter(message)
            }else if(binding.mesajlar.text.toString()=="Necəsən"){
                message+=MessagesData(binding.mesajlar.text.toString(),"00:00",true)
                binding.rvMesssages.adapter=adapter
                adapter.updateAdapter(message)
                binding.mesajlar.setText("")
                message+=MessagesData("Yaxşıyam.Sən necəsən","00:00",false)
                binding.rvMesssages.adapter=adapter
                adapter.updateAdapter(message)
            } else{
                message+=MessagesData(binding.mesajlar.text.toString(),"00:00",true)
                binding.rvMesssages.adapter=adapter
                adapter.updateAdapter(message)
                binding.mesajlar.setText("")
            }

        }
        binding.videocall.setOnClickListener {
            val intent=Intent(this,MainActivity18::class.java)
            intent.putExtra("name",binding.namechatinside.text.toString())
            intent.putExtra("lastseen",intent.getStringExtra("lastseen"))
            intent.putExtra("profileimg",intent.getIntExtra("profile",0))
            startActivity(intent)
            finish()
        }

        setup()
    }
    private fun setup(){
        binding.rvMesssages.layoutManager=LinearLayoutManager(this)
        binding.rvMesssages.adapter=adapter
        var message= arrayListOf<MessagesData>(
            MessagesData("Salam.Necəsən?","12:28",false),
            MessagesData("Salam yaxşıyam.Sən necəsən?","12:28",true),
            MessagesData("Həll edə bildin problemi","12:28",false),
            MessagesData("Hə düzəltdim.Çox sağol","12:28",true),
            MessagesData("Nə yaxşı.Təbrik edirəm.","12:28",false),
            MessagesData("Minnətdaram","12:29",true)
        )
        adapter.updateAdapter(message)
    }
}


