package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import com.example.asan.databinding.ActivityMain11Binding

class MainActivity11 : AppCompatActivity() {
    private lateinit var binding:ActivityMain11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain11Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var date= arrayListOf<DateData>(
            DateData("15","10","2023","K205 1-ci qiymətləndirilməsi"),
            DateData("16","10","2023","K206 1-ci qiymətləndirilməsi"),
            DateData("5","10","2023","K204 2-ci qiymətləndirilməsi"),
            DateData("25","10","2023","K202 qrupunun imtahani"),
        )
        val istirak= arrayListOf<String>(
            "Kənan Quliyev","Dürdanə Qasımova","Nigar Əsədova"
        )
        binding.calendarView2.setOnDateChangeListener { calendarView, year, month, day ->
            binding.textView24.text=""
            binding.vaxt.visibility=View.INVISIBLE
            for (i in date){
                if(day==i.day.toInt() && month==i.month.toInt()-1) {
                    binding.vaxt.visibility=View.VISIBLE
                    binding.textView24.text = i.text
                }
            }
        }
        binding.eventmenu.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent= Intent(this,MainActivity11::class.java)
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
        binding.birinci.setOnClickListener{
            val intent= Intent(this,MainActivity12::class.java)
            startActivity(intent)
            finish()
        }
        binding.ikinci.setOnClickListener{
            val intent= Intent(this,MainActivity12::class.java)
            startActivity(intent)
            finish()
        }
        binding.ucuncu.setOnClickListener{
            val intent= Intent(this,MainActivity12::class.java)
            startActivity(intent)
            finish()
        }
        binding.backarrowexamcalendar.setOnClickListener {
            val intent= Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.textView26.setOnClickListener {
            val intent= Intent(this,MainActivity10::class.java)
            startActivity(intent)
            finish()
        }
        binding.searchmenu.setOnClickListener {
            val intent=Intent(this,MainActivity16::class.java)
            startActivity(intent)
            finish()
        }
        binding.ac.setOnClickListener {
            for(i in istirak){
                binding.textView62.text=binding.textView62.text.toString()+i+"\n"
            }
            binding.ac.visibility=View.INVISIBLE
            binding.bagla.visibility=View.VISIBLE
            binding.textView62.visibility=View.VISIBLE
        }
        binding.bagla.setOnClickListener {
            binding.textView62.text=""
            binding.textView62.visibility=View.INVISIBLE
            binding.ac.visibility=View.VISIBLE
            binding.bagla.visibility=View.INVISIBLE
        }
        }
    }

