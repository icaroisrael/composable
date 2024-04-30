package com.eeep.composable.views

import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SnackbarM3(){
    Snackbar {
        Text(text = "Titulo")
    }
}