package com.example.asan
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asan.databinding.ItemEventsBinding


class EventAdapter( val context: Context):RecyclerView.Adapter<EventAdapter.EventsViewHolder>() {
    private val eventsList=ArrayList<EventData>()
    inner class EventsViewHolder(val binding: ItemEventsBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val layout=ItemEventsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return EventsViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return eventsList.size
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val item=eventsList[position]
        holder.binding.eventname.text=item.title
        holder.binding.imageView.setImageResource(item.image)
    }

    fun updateAdapter(list:List<EventData>){
        eventsList.clear()
        eventsList.addAll(list)
        notifyDataSetChanged()
    }
}