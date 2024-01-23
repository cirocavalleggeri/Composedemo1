package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope


import org.altervista.ultimaprovaprmadi.composedemo1.viewmodel.MainActivityViewModel
import org.altervista.ultimaprovaprmadi.composedemo1.viewmodel.MainActivityViewModelFactory
//import androidx.databinding.DataBindingUtil
//import org.altervista.ultimaprovaprmadi.composedemo1.databinding.ActivityMainBinding

class FlowState : ComponentActivity() {
   /* private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 /*     *//*  val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)*//*
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main_binding)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)

//        viewModel.totalData.observe(this, Observer {
//            binding.resultTextView.text = it.toString()
//        })

        lifecycleScope.launchWhenCreated {
            viewModel.flowTotal.collect{
                binding.resultTextView.text = it.toString()
            }
        } //consumatore

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
        }*/
    }
}

