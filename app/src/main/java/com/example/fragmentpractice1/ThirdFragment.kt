package com.example.fragmentpractice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentpractice1.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentThirdBinding>(inflater,R.layout.fragment_third,container,false)
        binding.thirdFragNxtButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_firstFragment)
        )


        return binding.root
    }
}