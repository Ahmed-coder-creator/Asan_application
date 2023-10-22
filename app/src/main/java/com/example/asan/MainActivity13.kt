package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain13Binding

class MainActivity13 : AppCompatActivity() {
    private lateinit var binding: ActivityMain13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain13Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var qiymetlendirme1= arrayListOf<qiymetlendirme>(
            qiymetlendirme("Nazlı Rəhimova","44","28-07-2023"),
            qiymetlendirme("Aynur Ağayeva","44","28-07-2023")
        )
        var qiymetlendirme2= arrayListOf<qiymetlendirme>(
            qiymetlendirme("Cavad Şükürov","48","30-08-2023"),
            qiymetlendirme("Azad Babayev","48","30-08-2023")
        )
        var telimler= arrayListOf<telimdata>(
            telimdata("Nazlı R","K.fəaliyəti","orta","29-06-2023"),
            telimdata("Röya İ(A)","V.i.olunması","orta","13-09-2023"),
            telimdata("Röya İ(A)","S.i.olun","orta","03-09-2023"),
            telimdata("Nazlı R","İşgüzar e.","orta","17-07-2023"),
            telimdata("Röya İ(A)","Ü.bacarıqlar","orta","16-09-2023")

        )
        for(q in qiymetlendirme1){
            binding.qiymetlendireninadi1.text=binding.qiymetlendireninadi1.text.toString()+"\n"+q.adi+"\n"
            binding.topladigibal1.text=binding.topladigibal1.text.toString()+"\n"+q.qiymet+"\n"
            binding.qiymetlendirmetarixi1.text=binding.qiymetlendirmetarixi1.text.toString()+"\n"+q.tarix+"\n"
            binding.textView31.text=(binding.textView31.text.toString().toInt()+q.qiymet.toInt()).toString()
        }
        for(r in qiymetlendirme2){
            binding.qiymetlendirmeadi2.text=binding.qiymetlendirmeadi2.text.toString()+"\n"+r.adi+"\n"
            binding.topladigibal.text=binding.topladigibal.text.toString()+"\n"+r.qiymet+"\n"
            binding.qiymetlendirmetarixi2.text=binding.qiymetlendirmetarixi2.text.toString()+"\n"+r.tarix+"\n"
            binding.textView37.text=(binding.textView37.text.toString().toInt()+r.qiymet.toInt()).toString()
        }
        binding.textView59.text= (binding.textView37.text.toString().toInt()+binding.textView31.text.toString().toInt()).toString()
        for (t in telimler){
            binding.telimqiymetadi.text=binding.telimqiymetadi.text.toString()+"\n"+t.qiymetlendirmeniaparan+"\n"
            binding.telimadi.text=binding.telimadi.text.toString()+"\n"+t.teliminadi+"\n"
            binding.istiraksevviyesitext.text=binding.istiraksevviyesitext.text.toString()+"\n"+t.istirakseviyesi+"\n"
            binding.qiymetlendirmenintarixi.text=binding.qiymetlendirmenintarixi.text.toString()+"\n"+t.qiymetlendirmenintarixi+"\n"
        }
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
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.imageView22.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.imageView30.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
    }
}