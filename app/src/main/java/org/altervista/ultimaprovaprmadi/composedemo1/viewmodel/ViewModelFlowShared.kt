package org.altervista.ultimaprovaprmadi.composedemo1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.launch
class ViewModelFlowShared(startingTotal : Int):ViewModel() {
    private val _flowTotal = MutableStateFlow<Int>(0)
    val flowTotal : StateFlow<Int> = _flowTotal

    private val _message = MutableSharedFlow<String>()
    val message : MutableSharedFlow<String> = _message


    init {
        _flowTotal.value = startingTotal
    }

    fun setTotal(input:Int){
        _flowTotal.value = (_flowTotal.value).plus(input)
        viewModelScope.launch {
            _message.emit("Total updated successfully!")
        }
    }
}