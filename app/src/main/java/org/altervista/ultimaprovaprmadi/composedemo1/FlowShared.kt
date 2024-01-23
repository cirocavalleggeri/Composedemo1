package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme
import org.altervista.ultimaprovaprmadi.composedemo1.viewmodel.MainActivityViewModelFlowSharedFactory
import org.altervista.ultimaprovaprmadi.composedemo1.viewmodel.ViewModelFlowShared

class FlowShared : ComponentActivity() {
    /*private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModelFlowShared
    private lateinit var viewModelFactory: MainActivityViewModelFlowSharedFactory*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   /*     binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)

        lifecycleScope.launchWhenCreated {
            viewModel.flowTotal.collect{
                binding.resultTextView.text = it.toString()
            }
        }

        lifecycleScope.launchWhenCreated {
            viewModel.message.collect{
                Toast.makeText(this@MainActivity,it,Toast.LENGTH_LONG).show()
            }
        }

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
        }*/
    }
}

