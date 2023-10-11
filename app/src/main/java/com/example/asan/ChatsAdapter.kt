package com.example.asan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asan.databinding.ChatsBinding

class ChatsAdapter(var context: Context):RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder>() {
    private val chatslist= ArrayList<ChatsData>()
    inner class ChatsViewHolder(val binding:ChatsBinding):RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        val layout=ChatsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ChatsViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return chatslist.size
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {
        val item=chatslist[position]
        holder.binding.name.text=item.name
        holder.binding.lastseen.text=item.lastseen
        holder.binding.profilemgchats.setImageResource(item.photo)
        holder.binding.chat.setOnClickListener {
            val intent=Intent(context,MainActivity17::class.java)
            intent.putExtra("name",item.name)
            intent.putExtra("lastseen",item.lastseen)
            intent.putExtra("profile",item.photo)
            context.startActivity(intent)
        }
        holder.binding.textView45.text=item.lastmessage
    }
    fun updateAdapter(list:List<ChatsData>){
        chatslist.clear()
        chatslist.addAll(list)
        notifyDataSetChanged()
    }
}