package org.altervista.ultimaprovaprmadi.composedemo1

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import org.altervista.ultimaprovaprmadi.composedemo1.recyclerviewcompose.InfoActivity
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme


@Composable
fun TvShowListItem(tvShow: TvShow, selectedItem: (TvShow)->Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        // elevation = 10.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .clickable { selectedItem(tvShow) },
            verticalAlignment = Alignment.CenterVertically
        ) {
            TvShowImage(tvShow = tvShow)
            Column {
                Text(text = tvShow.name, style = MaterialTheme.typography.bodySmall)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = tvShow.overview,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = tvShow.year.toString(), style = MaterialTheme.typography.bodySmall)
                    Text(text = tvShow.rating.toString(), style = MaterialTheme.typography.bodySmall)
                }

            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview7() {
    Composedemo1Theme {
        val context= LocalContext.current

        //TvShowListItem(tvShow )
    }
}


