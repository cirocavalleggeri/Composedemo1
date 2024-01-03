package org.altervista.ultimaprovaprmadi.composedemo1

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.containerColor
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme



class Bottoni : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier= Modifier
                    .background(color = Color.White)
                    .fillMaxSize(),
                verticalArrangement= Arrangement.SpaceEvenly,
                horizontalAlignment= Alignment.CenterHorizontally
            ){

                BottoniDemo()
            }

        }
    }
}

@Composable
fun BottoniDemo() {
    val context= LocalContext.current
  Button(onClick = {
       Toast.makeText(context,"Button clicked",Toast.LENGTH_LONG).show()
         }
    
  ) {
      Text(text = "Add to Card")
    }
    Button(onClick = {
        Toast.makeText(context,"Button clicked",Toast.LENGTH_LONG).show()
    }
        ,enabled=false
    ) {
        Text(text = "Add to Card")
    }
    TextButton(onClick = {
        Toast.makeText(context,"TextButton clicked",Toast.LENGTH_LONG).show()
    }

    ) {
        Text(text = "Add to Card")
    }
   OutlinedButton(onClick = {
        Toast.makeText(context,"Outline Button clicked",Toast.LENGTH_LONG).show()
    }

    ) {
        Text(text = "Add to Card")
    }
    IconButton(onClick = {
        Toast.makeText(context,"Icon Button clicked",Toast.LENGTH_LONG).show()
    }

    ) {
       Icon(Icons.Filled.MailOutline, contentDescription ="invia email"
            ,tint=Color.Green
            ,modifier=Modifier.size(89.dp)
       )
    }
    Button(onClick = {
        Toast.makeText(context,"Button clicked",Toast.LENGTH_LONG).show()
    },
            shape = CutCornerShape(10.dp),
      contentPadding = PaddingValues(16.dp)
     ,border= BorderStroke(5.dp, color = Color.Yellow)
     , colors = ButtonDefaults.textButtonColors(
            containerColor=Color.Green,
            contentColor = Color.White
        )

    ) {
        Text(text = "Add to Card",
             style=MaterialTheme.typography.bodyLarge,
             modifier=Modifier.padding(5.dp)
            )
    }
    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
    },
        shape = CircleShape,
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(5.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            containerColor=Color.Green,
            contentColor = Color.Blue
        )
    ) {
        Text("Add To Cart",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(5.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Bottoni1() {
   BottoniDemo()
}