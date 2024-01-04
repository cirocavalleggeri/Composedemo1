package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class FlowDemo1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myFlow = flow<Int> {
            for (i in 1..100){
                emit(i)
                delay(1000L)
            }
        }
        setContent {
            val currentValue = myFlow.collectAsState(initial = 1).value
            //in questo esempio con collectAsState abbiamo dato a flow uno stato
            Composedemo1Theme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Current index is $currentValue",
                        fontSize = 25.sp
                    )
                }
            }
        }
    }
}

