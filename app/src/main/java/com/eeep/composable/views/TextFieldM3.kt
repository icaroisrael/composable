package com.eeep.composable.views

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldM3(){
    Column {
        var campo1 by remember {mutableStateOf("")}
        var campo2 by remember {mutableStateOf("")}
        var usuario by remember {mutableStateOf("")}
        var senha by remember {mutableStateOf("")}
        var email by remember {mutableStateOf("")}
        var nome by remember {mutableStateOf("")}
        val context = LocalContext.current



        TextField(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            value =campo1,
            onValueChange = {
                campo1 =  it
            },
            label = { Text(text = "Valor1")}
        )

        TextField(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            value =campo2,
            onValueChange = {
                campo2 =  it
            },
            label = { Text(text = "Valor2")}
        )
        TextField(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            value =usuario,
            onValueChange = {
                usuario =  it
            },
            label = { Text(text = "Usuário")},
            //COLOCA IMAGEM AO LADO ESQUERDO CAMPO
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Imagem que representa o usuario"
                )
            }
        )

        TextField(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            value =email,
            onValueChange = {
                email =  it
            },
            label = { Text(text = "Email")},
            //COLOCA IMAGEM AO LADO Direito CAMPO
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Imagem que representa o email"
                )
            }
        )

        TextField(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            value = senha,
            onValueChange = {
                senha =  it
            },
            label = { Text(text = "Senha")},
            visualTransformation = PasswordVisualTransformation(),
            //COLOCA IMAGEM AO LADO Direito CAMPO
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Password,
                    contentDescription = "Imagem que representa a senha"
                )
            }
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            label = { Text(text = "Nome") },
            value = nome,
            onValueChange = {
                nome = it
            })



        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                var a : Double = campo1.toString().toDouble();
                var b : Double = campo2.toString().toDouble();
                var r : Double = a + b


                Toast.makeText(context, r.toString()
                    , Toast.LENGTH_LONG).show()
            }){
            Text(text = "Calcular")
        }
    }

}


