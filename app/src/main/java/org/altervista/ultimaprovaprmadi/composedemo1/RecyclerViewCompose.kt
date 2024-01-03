package org.altervista.ultimaprovaprmadi.composedemo1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.recyclerviewcompose.InfoActivity

class RecyclerViewCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ScrollableColumnDemo()
            //LazyColumnDemo()
           /* LazyColumnDemo2 {
               Toast.makeText(this, it , Toast.LENGTH_LONG).show()
           }*/
            /*LazyRowDemo2 {
                Toast.makeText(this, it , Toast.LENGTH_LONG).show()
            }*/
            DisplayTvShows {
                //Toast.makeText(this, it.name,Toast.LENGTH_LONG).show()
                startActivity(InfoActivity.intent(this,it))
            }
        }
    }
}

@Composable
fun ScrollableColumnDemo() {

    //con verticalscroll abbiamo reso la colonna equivalente alla listview in xml
    //ma essa non efficiente perchè mostra tutti i 10 items con un impegno di memoria notevole
    // la soluzione è LazyColumn equivalente alla recyclerView
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..100) {
            Text(
                "User Name $i",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(5.dp)
            )
            Divider(color = Color.Black, thickness = 5.dp)
        }
    }
}

@Composable
fun LazyColumnDemo() {
    LazyColumn {
        items(100) {
            Text(
                "User Name $it",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(10.dp)
            )
            Divider(color = Color.Black, thickness = 5.dp)
        }
    }
}
@Composable
fun LazyColumnDemo2(selectedItem: (String) -> (Unit)) {
    //rendiamo la lista cliccabile
    LazyColumn {
        items(100) {
            Text(
                "User Name $it",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .padding(10.dp)
                    .clickable { selectedItem("$it Selected") }
            )
            Divider(color = Color.Black, thickness = 5.dp)
        }
    }
}
@Composable
fun LazyRowDemo2(selectedItem: (String) -> (Unit)) {
    //rendiamo la lista cliccabile
    LazyRow {
        items(100) {
            Text(
                "User Name $it",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier
                    .padding(10.dp)
                    .clickable { selectedItem("$it Selected") }
            )
            Divider(color = Color.Black, thickness = 5.dp)
        }
    }
}
//Displaying TvShow list

@Composable
fun DisplayTvShows(selectedItem: (TvShow) -> Unit) {

    val tvShows = remember { TvShowList.tvShows }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp,vertical = 8.dp)
    ) {
        items(
            items = tvShows,
            itemContent = {
                TvShowListItem(tvShow = it, selectedItem)
            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    Composedemo1Theme {
        val context= LocalContext.current
        DisplayTvShows {
           Toast.makeText(context, it.name,Toast.LENGTH_LONG).show()
          //  startActivity(InfoActivity.intent(this,it))


        }
    }
}