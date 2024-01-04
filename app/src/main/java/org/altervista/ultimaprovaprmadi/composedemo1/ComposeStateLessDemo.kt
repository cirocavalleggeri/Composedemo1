package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class ComposeStateLessDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    var count by remember {mutableStateOf(0)}
                   // MyButton(currentCount = count) { count = it + 1 }
                    MyButton(count,{ count = it + 1 })
                }
            }
        }
    }
}

@Composable
fun MyButton(currentCount:Int, updateCount:(Int)->Unit){
    Button(onClick = {
        updateCount(currentCount)
    },
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            containerColor=Color.Green,
            contentColor = Color.White
        )
    ) {
        Text("Count is : $currentCount questa funzione compose non ha bisogno di ricordare lo stato della variabile che cambia perchè" +
                "il tutto è stato delegato al chiamante che gli passa una variabile che conserva lo stato remember e una funzione per incrementare" +
                "la variabile",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(5.dp)
        )
    }
}