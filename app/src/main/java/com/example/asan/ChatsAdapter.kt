package com.example.asan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asan.databinding.ChatsBinding

class ChatsAdapter:RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder>() {
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
        for(i in item.messages){
            holder.binding.lastmessage.text=i.message
        }
    }
    fun updateAdapter(list:List<ChatsData>){
        chatslist.clear()
        chatslist.addAll(list)
        notifyDataSetChanged()
    }
}