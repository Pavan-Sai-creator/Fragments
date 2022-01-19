package com.example.fragmentpractice1

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class DummyClass(lifecycle: Lifecycle):LifecycleObserver {
    init {
        lifecycle.addObserver(this)
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun function1(){
        Log.i("MainActivity","Function1 called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun function2(){
        Log.i("MainActivity","Function2 called")
    }
}