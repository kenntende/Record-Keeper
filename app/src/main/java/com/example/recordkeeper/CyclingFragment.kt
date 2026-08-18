package com.example.recordkeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recordkeeper.databinding.FragmentCyclingBinding


class CyclingFragment : Fragment() {

    private var _binding: FragmentCyclingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cyclingList = arrayListOf(
            Cycling("Half Marathon", "31.02", "03/10/2020"),
            Cycling("Full Marathon", "1.05.02", "12/12/2022"),
            Cycling("5km", "15.02", "12/12/2022"),
            Cycling("10km", "54.02", "12/01/2026"),
            Cycling("5km", "35.02", "01/07/2026"),
            Cycling("5km", "40.02", "12/07/2026")
        )

        binding.recyclerViewCycling.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewCycling.setHasFixedSize(true)
        binding.recyclerViewCycling.adapter = CyclingAdapter(cyclingList)
    }

    private fun setupClickListeners() {
//        binding
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}