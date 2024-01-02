package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

class Colonne : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {
                // A surface container using the 'background' color from the theme

                Column(
                    modifier=Modifier.background(color= Color.DarkGray)
                        .fillMaxSize(),
                      verticalArrangement=Arrangement.Center,
                       horizontalAlignment=Alignment.CenterHorizontally
                ){
                    Greeting2("ABC")
                    Greeting2("DE")
                    Greeting2("FG")
                }

            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Text(
        text = "Colonne $name!",
        modifier=Modifier.background(color= Color.Yellow)
            .border(5.dp, color = Color.Blue)
            .padding(10.dp)

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Composedemo1Theme {
        Column{
           Greeting2("ABC")
           Greeting2("DE")
           Greeting2("FG")
        }
    }
}