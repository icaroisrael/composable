package com.eeep.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eeep.composable.ui.theme.ComposableTheme
import com.eeep.composable.views.AlertDialogM3
import com.eeep.composable.views.ExposedDropDownMenuBoxM3
import com.eeep.composable.views.SnackbarM3
import com.eeep.composable.views.TextFieldM3
import com.eeep.ocorrencia1.views.ButtonM3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExposedDropDownMenuBoxM3()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableTheme {
        ExposedDropDownMenuBoxM3()
    }
}

