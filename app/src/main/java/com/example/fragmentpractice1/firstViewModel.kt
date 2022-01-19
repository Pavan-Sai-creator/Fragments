package com.example.fragmentpractice1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class firstViewModel: ViewModel() {

    // Lifecycles
    val data = MutableLiveData<Int>()
    init {
        data.value = 0
    }

    fun changeData(){
        data.value = (data.value)?.plus(2)
    }
}