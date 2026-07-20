package com.example.recordkeeper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recordkeeper.databinding.FragmentRunningBinding


class RunningFragment : Fragment() {

    private var _binding: FragmentRunningBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRunningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val runningList = arrayListOf(
            Running("5km", "31.02", "12/12/2017"),
            Running("10km", "1.05.02", "12/12/2022"),
            Running("15km", "1.31.02", "12/12/2022"),
            Running("25km", "2.10.02", "12/01/2026"),
            Running("5km", "35.02", "01/07/2026"),
            Running("5km", "40.02", "12/07/2026")
        )

        binding.recyclerViewRunning.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewRunning.setHasFixedSize(true)
        binding.recyclerViewRunning.adapter = RunningAdapter(runningList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}