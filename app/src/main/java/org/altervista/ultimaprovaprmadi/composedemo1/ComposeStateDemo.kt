package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme


class ComposeStateDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MyButton()
                }
            }
        }
    }

    //val count = mutableStateOf(0)
   // var count =0
  // val count= mutableStateOf(1)
    @Preview(name = "MyButton")
    @Composable
    fun MyButton() {

        val context = LocalContext.current
        Toast.makeText(context,"Se non si dice alla variabile cont che è soggetta a cambiamenti," +
                "il numero nel bottone non si aggiorna",Toast.LENGTH_LONG).show()
        val count = remember { mutableStateOf(0) }
        // se la usiamo all interno di una funzione la variabile deve essere ricordata
        // per la variabile count usiamo vaal e non var perchè essa è un oggetto e non una primitiva,quello che cambia
        // è la proprietà count.value e non l'oggetto
        //Tutta via possiamo trattare count come una variabile numerica se sostituiamo "=" con "by"
        //    var count by remember { mutableStateOf(0) } ,in questo modo abbiamo delegato l'oggetto ad una proprietà
        Button(
            onClick = {
               count.value = count.value + 1
              //  count++
                Toast.makeText(context, "Count is : ${count.value}", Toast.LENGTH_SHORT).show()
             //   Toast.makeText(context, "Count is : ${count}", Toast.LENGTH_SHORT).show()
                Toast.makeText(context,"Se non si dice alla variabile cont che è soggetta a cambiamenti," +
                        "il numero nel bottone non si aggiorna",Toast.LENGTH_LONG).show()

            },
            contentPadding = PaddingValues(16.dp),
            border = BorderStroke(10.dp, Color.Black),
            colors = ButtonDefaults.textButtonColors(
                containerColor=Color.Green,
                contentColor = Color.Black
            )
        ) {
            Text(
              //  "Count is : ${count}",
                "Count is : ${count.value}",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}