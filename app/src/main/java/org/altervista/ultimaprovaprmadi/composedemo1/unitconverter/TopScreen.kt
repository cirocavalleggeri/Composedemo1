package org.altervista.ultimaprovaprmadi.composedemo1.unitconverter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun TopScreen(list: List<Conversion>) {
    val selectedConversion : MutableState<Conversion?> = remember{ mutableStateOf(null)}
    val inputText : MutableState<String> = remember { mutableStateOf("")}

    ConversionMenu(list = list){
        selectedConversion.value = it
    }
  //  ConversionMenu(list = list, convert =  {selectedConversion.value=it} )
    selectedConversion.value?.let { InputBlock(conversion = it, inputText = inputText) }
}