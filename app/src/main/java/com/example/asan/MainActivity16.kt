package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asan.databinding.ActivityMain16Binding
import java.util.ArrayList

class MainActivity16 : AppCompatActivity() {
    private lateinit var binding: ActivityMain16Binding
    private val adapter = OnlineusersAdapter()
    private val chatsadapter = ChatsAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain16Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        chatssetup()
        binding.backchat.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
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
        binding.homemenu.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.exammenu.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun setup() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = adapter
        val onlineusers = arrayListOf<Int>(
            R.drawable.onlineuser1,
            R.drawable.onlineuser2,
            R.drawable.onlineuser3,
            R.drawable.onlineuser4,
            R.drawable.onlineuser5
        )
        adapter.updateAdapter(onlineusers)
    }

    private fun chatssetup() {
        binding.rvChats.layoutManager = LinearLayoutManager(this)
        binding.rvChats.adapter = chatsadapter
        val chats = arrayListOf<ChatsData>(
            ChatsData("Zərifə Qasimova", "15:30", R.drawable.zarifaqasimova,"Dostlar necə gedir işlər"),
            ChatsData("Sevil Mirzəyeva", "16:24", R.drawable.sevilmirzayeva,"Bu gün biraz gecikəcəm"),
            ChatsData("Nuray Safar","18:14",R.drawable.nuraysafar,"1-ci hisədə qeyd olunub"),
            ChatsData("Tunal Həsənov","06:12",R.drawable.tunalhasanov,"Tamam həll edərik")
        )
        chatsadapter.updateAdapter(chats)
    }
}