package org.altervista.ultimaprovaprmadi.composedemo1.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainActivityViewModelFlowSharedFactory(private val startingTotal : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = ViewModelFlowShared(startingTotal) as T
}