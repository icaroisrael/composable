package com.eeep.composable.views

import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.eeep.composable.R
import com.eeep.composable.ui.theme.GREEN
import com.eeep.composable.ui.theme.RED

@Composable
fun AlertDialogM3(){
    var openDialog by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {
                         openDialog = true

        },
            colors = ButtonDefaults.buttonColors(Color.White)
            ) {
            Text(text = "Assinar")           
        }

        if(openDialog){
            AlertDialog(
                onDismissRequest = {
                                   openDialog = false
                },
                confirmButton = {
                                Button(
                                    onClick = {
                                              Toast.makeText(context, "Assinatura anual confirmada com sucesso", Toast.LENGTH_LONG).show()
                                        openDialog = false
                                    },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = GREEN
                                    )
                                ) {
                                    Text(text = "Confirma")
                                    
                                }
                },
                dismissButton = {
                    Button(
                        onClick = {
                                  openDialog = false
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = RED
                        )
                    ) {
                        Text(text = "Cancelar")

                    }

                },
                title = {

                    Text(
                        text = stringResource(id = R.string.title_alertDialog)
                    )
                },
                text = {
                    Text(text = stringResource(id = R.string.text_alertDialog)
                    )
                },
                containerColor = Color.White,
                shape = RoundedCornerShape(15.dp)

            )
        }
        




    }

}




