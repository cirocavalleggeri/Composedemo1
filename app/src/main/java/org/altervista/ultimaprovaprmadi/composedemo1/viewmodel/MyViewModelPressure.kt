package org.altervista.ultimaprovaprmadi.composedemo1.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MyViewModelPressure:ViewModel() {
    val myFlow = flow<Int> {
        for (i in 1..100){
            emit(i)
            delay(1000L)
        }
    }

    init {
        backPressureDemo()
    }


    private fun backPressureDemo(){
        val myFlow1 = flow<Int> {
            for (i in 1..10){
                Log.i("MYTAG","Produced $i")
                emit(i)
                delay(1000L)
            }
        }

        viewModelScope.launch {
            //con  myFlow1.buffer().collect noi non facciamo aspettare il produttore,immagazziniamo tutti i suoi dati in un buffer
            myFlow1.collect {
                delay(3000L)
                Log.i("MYTAG","Consumed $it")
            }
        }



    }
}