package org.altervista.ultimaprovaprmadi.composedemo1.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MyViewModel:ViewModel() {
    var count by mutableStateOf(0)
    val myFlow = flow<Int> {
        for (i in 1..100){
            emit(i)
            delay(1000L)
        }
    }
    fun increaseCount(){
        count++
    }
}