package com.example.fragmentpractice1

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.fragmentpractice1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var viewModel: firstViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater,R.layout.fragment_second,container,false)
        binding.secondFragNxtButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment)
        )
        viewModel = ViewModelProviders.of(this).get(firstViewModel::class.java)
        viewModel.data.observe(viewLifecycleOwner, Observer { newData ->
            binding.dataValTv.text = newData.toString()
        })


        binding.dataBt.setOnClickListener {
            viewModel.changeData()
        }



        var args = SecondFragmentArgs.fromBundle(requireArguments())
        binding.frag2TextView.text = "Received Data: ${args.number}"
        if(args.number==11)
        {
            val shareIntent = Intent(Intent.ACTION_SEND).setType("text/plain").putExtra(Intent.EXTRA_TEXT,"Data Sent: Hello Sitara")
            startActivity(shareIntent)
        }

        return binding.root
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("SecondFragment","onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("SecondFragment","onViewCreated called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondFragment","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondFragment","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondFragment","onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("SecondFragment","onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondFragment","onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("SecondFragment","onDetach called")
    }
}