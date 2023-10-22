package com.example.asan

import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginLeft
import androidx.recyclerview.widget.RecyclerView
import com.example.asan.databinding.MessageBinding

class MessageAdapter:RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {
    inner class MessageViewHolder(val binding:MessageBinding):RecyclerView.ViewHolder(binding.root)
    private val messages=ArrayList<MessagesData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val layout=MessageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MessageViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return messages.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val item=messages[position]
        holder.binding.message.text=item.message
        holder.binding.senttime.text=item.time
        if (item.center==true){
            holder.binding.mess.setBackgroundColor(Color.parseColor("#2F5FFF"))
            holder.binding.message.setTextColor(Color.WHITE)
            holder.binding.senttime.setTextColor(Color.WHITE)
        }
        if (item.center==false){
            holder.binding.mess.setBackgroundColor(Color.WHITE)
            holder.binding.message.setTextColor(Color.BLACK)
            holder.binding.senttime.setTextColor(Color.BLACK)
            val layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            holder.binding.card.layoutParams = layoutParams
            holder.binding.card.requestLayout()
        }

    }
    fun updateAdapter(list:List<MessagesData>){
        messages.clear()
        messages.addAll(list)
        notifyDataSetChanged()

    }
}