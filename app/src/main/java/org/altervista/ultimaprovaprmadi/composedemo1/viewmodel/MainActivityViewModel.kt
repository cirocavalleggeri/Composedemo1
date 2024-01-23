package org.altervista.ultimaprovaprmadi.composedemo1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
//    private var total = MutableLiveData<Int>()
//    val totalData : LiveData<Int>
//        get() = total

    private val _flowTotal = MutableStateFlow<Int>(0)
    val flowTotal : StateFlow<Int> = _flowTotal
    //get() = _flowTotal

    private val _message = MutableSharedFlow<String>()   //questo pre cooroutine flowshared
    val message : MutableSharedFlow<String> = _message


    init {
        // total.value = startingTotal
        _flowTotal.value = startingTotal
    }

    fun setTotal(input:Int){
        // total.value =(total.value)?.plus(input)
        _flowTotal.value = (_flowTotal.value).plus(input)
    }
}