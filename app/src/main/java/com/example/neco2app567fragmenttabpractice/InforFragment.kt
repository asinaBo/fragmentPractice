package com.example.neco2app567fragmenttabpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels

import com.example.neco2app567fragmenttabpractice.databinding.FragmentInfoBinding


class InforFragment : Fragment() {
    private val model: MainViewModel by activityViewModels()
    lateinit var binding: FragmentInfoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.tvInfo.text = it.info

        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = InforFragment()
    }
}