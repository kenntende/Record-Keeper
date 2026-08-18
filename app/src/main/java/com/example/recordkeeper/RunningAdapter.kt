package com.example.recordkeeper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recordkeeper.databinding.ItemLayoutBinding

class RunningAdapter(private val runningList: List<Running>) : RecyclerView.Adapter<RunningAdapter.RunningViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RunningViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RunningViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RunningViewHolder, position: Int) {
        val currentItem = runningList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = runningList.size

    class RunningViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(running: Running) {
            binding.textViewDistance.text = running.distance
            binding.textViewDuration.text = running.runningTime
            binding.textViewDate.text = running.date
        }
    }
}