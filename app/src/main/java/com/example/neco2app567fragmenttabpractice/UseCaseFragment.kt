package com.example.neco2app567fragmenttabpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.neco2app567fragmenttabpractice.databinding.FragmentUseCaseBinding


class UseCaseFragment : Fragment() {
    private val model: MainViewModel by activityViewModels()
    lateinit var binding: FragmentUseCaseBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUseCaseBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.tvUseCase.text = it.useCase

        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = UseCaseFragment()
    }
}