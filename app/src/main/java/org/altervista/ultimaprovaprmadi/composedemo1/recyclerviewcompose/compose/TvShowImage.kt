package org.altervista.ultimaprovaprmadi.composedemo1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme


@Composable
fun TvShowImage(tvShow: TvShow) {
    Image(
        painter = painterResource(id = tvShow.imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(4.dp)
            .height(140.dp)
            .width(100.dp)
            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))

    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview6() {
    Composedemo1Theme {
        val context= LocalContext.current
       val tvShow= TvShow(
            id = 8,
            name = "Legacies",
            year = 2018,
            rating = 7.4,
            imageId = R.drawable.legacies,
            overview = "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted."
        )
        TvShowImage(tvShow)
    }
}