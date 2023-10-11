package com.example.asan

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toBitmapOrNull
import com.example.asan.databinding.ActivityMain18Binding

class MainActivity18 : AppCompatActivity() {
    private lateinit var binding:ActivityMain18Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain18Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.namevideocall.text=intent.getStringExtra("name")
        if(binding.namevideocall.text.toString()=="Zərifə Qasimova"){
            binding.komuzvonyat.setImageResource(R.drawable.zarifabig)
        }else if (binding.namevideocall.text.toString()=="Sevil Mirzəyeva"){
            binding.komuzvonyat.setImageResource(R.drawable.sevilbig)
        }else if (binding.namevideocall.text.toString()=="Nuray Safar"){
            binding.komuzvonyat.setImageResource(R.drawable.nuraybig)
        }else if (binding.namevideocall.text.toString()=="Tunal Həsənov"){
            binding.komuzvonyat.setImageResource(R.drawable.tunalbig)
        }
        binding.zarifa.setOnClickListener {
            val photozarifa=binding.zarifa.drawable
            val photokomu=binding.komuzvonyat.drawable
            binding.zarifa.setImageDrawable(photokomu)
            binding.komuzvonyat.setImageDrawable(photozarifa)
        }
        binding.microfone.setOnClickListener {
            binding.microfoneoff.visibility=View.VISIBLE
            binding.microfone.visibility=View.INVISIBLE
            }
        binding.microfoneoff.setOnClickListener {
            binding.microfoneoff.visibility=View.INVISIBLE
            binding.microfone.visibility=View.VISIBLE
        }
        binding.dinamikon.setOnClickListener {
            binding.dinamikoff.visibility=View.VISIBLE
            binding.dinamikon.visibility=View.INVISIBLE
        }
        binding.dinamikoff.setOnClickListener {
            binding.dinamikon.visibility=View.VISIBLE
            binding.dinamikoff.visibility=View.INVISIBLE
        }
        binding.otboy.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.backtochat.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        }

    }

