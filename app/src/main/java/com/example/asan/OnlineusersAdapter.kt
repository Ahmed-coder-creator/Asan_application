package com.example.asan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asan.databinding.ItemUserOnlineBinding

class OnlineusersAdapter:RecyclerView.Adapter<OnlineusersAdapter.OnlineusersViewHolder>(){
    inner class OnlineusersViewHolder(val binding:ItemUserOnlineBinding):RecyclerView.ViewHolder(binding.root)
    private val onlinelist= ArrayList<Int>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnlineusersViewHolder {
        val layout=ItemUserOnlineBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return OnlineusersViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return onlinelist.size
    }

    override fun onBindViewHolder(holder: OnlineusersViewHolder, position: Int) {
        val item=onlinelist[position]
        holder.binding.imageView20.setImageResource(item)
    }
    fun updateAdapter(list: List<Int>){
        onlinelist.clear()
        onlinelist.addAll(list)
        notifyDataSetChanged()

    }
}