package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {

                    Greeting("Android")
                }
            }
        }
    }


@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        fontSize=32.sp,
        fontWeight = FontWeight.Companion.Bold,
        color= Color.Cyan,
        textAlign= TextAlign.Center,
        modifier=Modifier.background(color=Color.Yellow)
                  .border(5.dp, color = Color.Blue)
                  .padding(10.dp)
                  .fillMaxWidth()
                  .fillMaxHeight()

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Composedemo1Theme {
        Greeting("Android")
    }
}