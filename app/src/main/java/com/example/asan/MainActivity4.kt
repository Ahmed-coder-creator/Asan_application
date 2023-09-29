package com.example.asan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asan.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    private val adapter=EventAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        binding.homemenu.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.accountmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun setup(){
        binding.rvEvents.layoutManager=LinearLayoutManager(this)
        binding.rvEvents.adapter=adapter

        val list= listOf(
            EventData("“ASAN” Təlim-Tədris mərkəzində “Sabah” tələbələrinə təlim keçirilib",R.drawable.sabah),
            EventData("“ASAN xidmət”də “Bədən dili” mövzusunda təlim keçirilib",R.drawable.bedendili),
            EventData("“ASAN xidmət” mərkəzinin əməkdaşları üçün “Etik davranış qaydaları və xidmət mədəniyyəti” mövzusunda təlim keçirilib",R.drawable.etik),
            EventData("Dövlət Agentliyi və TİKA-nın birgə təşkil etdiyi təlimlər başa çatdı",R.drawable.tika),
            EventData("Gəncədə “ASAN xidmət” mərkəzində silsilə təlimlər keçirilmişdir",R.drawable.gence)
        )
        adapter.updateAdapter(list)
    }
}