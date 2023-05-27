package com.example.neco2app567fragmenttabpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.example.neco2app567fragmenttabpractice.databinding.FragmentContentBinding
import com.google.android.material.tabs.TabLayoutMediator


class ContentFragment : Fragment() {
    private val model: MainViewModel by activityViewModels()
    lateinit var binding: FragmentContentBinding

    private val fragList = listOf(
        InforFragment.newInstance(),
        UseCaseFragment.newInstance()

    )

    private var fragListTitle= listOf(
        "Description",
        "Uses"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.ivContentF.setImageResource(it.imageId)
        }

        val adapter = VpAdapter(activity as AppCompatActivity,fragList)
        binding.vp.adapter = adapter
        TabLayoutMediator(binding.tb,binding.vp){
                tab,pos ->tab.text = fragListTitle[pos]
        }.attach()
    }
    companion object {

        @JvmStatic
        fun newInstance() = ContentFragment()

    }
}