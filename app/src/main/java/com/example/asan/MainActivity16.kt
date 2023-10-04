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
    private val chatsadapter = ChatsAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain16Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        chatssetup()
        binding.backchat.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
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
        binding.recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = adapter
        val onlineusers = arrayListOf<Int>(
            R.drawable.onlineuser1,
            R.drawable.onlineuser2,
            R.drawable.onlineuser3,
            R.drawable.onlineuser4
        )
        adapter.updateAdapter(onlineusers)
    }

    private fun chatssetup() {
        binding.rvChats.layoutManager = LinearLayoutManager(this)
        binding.rvChats.adapter = chatsadapter
        val chats = arrayListOf<ChatsData>(
            ChatsData(
                "Əhməd Abışev", "15:30", R.drawable.ahmadabisev, arrayListOf(
                    messagesdata("Salam işlər necə gedir", true, "12:15")
                )
            ),
            ChatsData("Sevil Mirzəyeva", "16:24", R.drawable.sevilmirzayeva, arrayListOf(
                messagesdata("Cavablar qeyd olunub", true, "17:15")
            )
            ),
            ChatsData("Zərifə Qasımova","03:11",R.drawable.zarifaqasimova, arrayListOf(
                messagesdata("1-ci hissədə qeyd olunub",false,"05:15")
            )  ),
            ChatsData("Nuray Safar","18:14",R.drawable.nuraysafar, arrayListOf(
                messagesdata("Bu gün biraz gecikə bilərəm",true,"15:30")
            )),
            ChatsData("Tunal Həsənov","06:12",R.drawable.tunalhasanov, arrayListOf(
                messagesdata("Tamam həll edərik",false,"12:15")
            ))
        )
        chatsadapter.updateAdapter(chats)
    }
}