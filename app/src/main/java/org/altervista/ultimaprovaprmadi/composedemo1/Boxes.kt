package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class Boxes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //BoxExample1()
           // BoxExample3()
            BoxExample4()
        }
    }
}

@Composable
fun BoxExample1() {
   Box(
    modifier= Modifier
        .background(color = Color.Green)
        .size(180.dp, 300.dp)

   ){
       Box(
           modifier= Modifier
               .background(color = Color.Yellow)
               .size(100.dp, 200.dp)
               .align(Alignment.Center)
       ){

       }
       Text(text = "Ciao",
            style=MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .background(color = Color.White)
                .size(89.dp, 34.dp)
                .align(Alignment.BottomCenter)
           )
   }
}
@Composable
fun BoxExample3(){
    Box(modifier = Modifier
        .background(color = Color.Blue)
        .fillMaxSize()
    ){
      Text(text = "TopStart",
           style = MaterialTheme.typography.bodySmall,
          modifier=Modifier.background(color=Color.Cyan)
              .padding(10.dp)
              .align(Alignment.TopStart)

      )
        Text(text = "TopCenter",
            style = MaterialTheme.typography.bodySmall,
            modifier=Modifier.background(color=Color.Cyan)
                .padding(10.dp)
                .align(Alignment.TopCenter)

        )
        Text(text = "TopEnd",
            style = MaterialTheme.typography.bodySmall,
            modifier=Modifier.background(color=Color.Cyan)
                .padding(10.dp)
                .align(Alignment.TopEnd)

        )
        Text(text = "Center",
            style = MaterialTheme.typography.bodySmall,
            modifier=Modifier.background(color=Color.Cyan)
                .padding(10.dp)
                .align(Alignment.Center)

        )
        Text(text = "BottomCenter",
            style = MaterialTheme.typography.bodySmall,
            modifier=Modifier.background(color=Color.Cyan)
                .padding(10.dp)
                .align(Alignment.BottomCenter)

        )
    }
}
@Composable
fun BoxExample4() {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.beach_resort),
            contentDescription = "beach resort"
        )
        Text(
            text = "Beach Resort",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomStart)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
              //  backgroundColor = Color.White,
                contentColor = Color.DarkGray
            ),
            modifier = Modifier.background(color= Color.Yellow)
                .align(Alignment.TopEnd)
                .border(5.dp, Color.DarkGray, RectangleShape)
                .padding(10.dp)

        ) {
            Text("Add To Cart",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Companion.Bold )
        }

    }
}
@Preview(showBackground = true)
@Composable
fun BoxExample2() {
    BoxExample4()
}