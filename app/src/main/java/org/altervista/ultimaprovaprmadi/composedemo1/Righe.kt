package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class Righe : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {
                // A surface container using the 'background' color from the theme
               Row(
                   modifier=Modifier.background(color= Color.DarkGray)
                       .fillMaxSize(),
                   horizontalArrangement=Arrangement.SpaceAround,
                   verticalAlignment=Alignment.CenterVertically

               ) {
                   Greeting3("ABC")
                   Greeting3("DE")
                   Greeting3("FG")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    Text(
        text = name,

        color = Color.White,
        modifier=Modifier.background(color=Color.Black)
                          .border(2.dp, color = Color.Blue)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Composedemo1Theme {
        Row(
            modifier=Modifier.background(color= Color.DarkGray)
                .fillMaxSize(),
            horizontalArrangement=Arrangement.SpaceAround,
            verticalAlignment=Alignment.CenterVertically

        ) {
            Greeting3("ABC")
            Greeting3("DE")
            Greeting3("FG")
        }
    }
}