package com.example.recordkeeper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recordkeeper.databinding.ItemLayoutBinding

class CyclingAdapter(private val cyclingList: List<Cycling>) : RecyclerView.Adapter<CyclingAdapter.CyclingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclingViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CyclingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CyclingViewHolder, position: Int) {
        val currentItem = cyclingList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = cyclingList.size

    class CyclingViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cycling: Cycling) {
            binding.textViewDistance.text = cycling.distance
            binding.textViewDuration.text = cycling.cyclingTime
            binding.textViewDate.text = cycling.cyclingDate
        }
    }
}