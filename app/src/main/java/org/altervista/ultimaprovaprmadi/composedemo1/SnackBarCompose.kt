package org.altervista.ultimaprovaprmadi.composedemo1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.altervista.ultimaprovaprmadi.composedemo1.ui.theme.Composedemo1Theme

class SnackBarCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composedemo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        DisplaySnackBar()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DisplaySnackBar() {
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope: CoroutineScope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        content = {
            Button(
                onClick = {

                    coroutineScope.launch {
                        val snackbarResult=snackbarHostState.showSnackbar(
                            message = "This is the message",
                            actionLabel = "Undo",
                            duration = SnackbarDuration.Indefinite
                        )
                        when(snackbarResult){
                            SnackbarResult.ActionPerformed-> Log.i("MYTAG","Accettato")
                            SnackbarResult.Dismissed-> Log.i("MYTAG","Cancellato")
                            else-> Log.i("MYTAG","Nessun valore snackbar")
                        }
                    }
                })
            {
                Text(text = "Display SnackBar")
            }
        }
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Composedemo1Theme {
       DisplaySnackBar()
    }
}