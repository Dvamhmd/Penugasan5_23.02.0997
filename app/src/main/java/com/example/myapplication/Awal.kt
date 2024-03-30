package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Awal(navController: NavController){
    var nama by remember {
        mutableStateOf("")
    }
    var doa by remember {
        mutableStateOf("")
    }
    var pesan by remember {
        mutableStateOf("")
    }
    var pengirim by remember {
        mutableStateOf("")
    }





    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Surface (
            color = Color.Blue,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Custom Greeting Card",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "Silahkan Lengkapi Data Dibawah Ini",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
        )

        Spacer(modifier = Modifier.height(60.dp))
        OutlinedTextField(
            value = pesan,
            onValueChange = {pesan=it},
            label = { Text(text = "Masukkan Pesan")}
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = nama,
            onValueChange = {nama=it},
            label = { Text(text = "Masukkan Nama") }
        )
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = doa,
            onValueChange = {doa=it},
            label = { Text(text = "Masukkan Doa") }
        )
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = pengirim,
            onValueChange = {pengirim=it},
            label = { Text(text = "Masukkan Pengirim") },

        )
        Spacer(modifier = Modifier.height(40.dp))


        Button(
            onClick = {navController.navigate("2/$pesan/$nama/$doa/$pengirim")},
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(
                text = "Hasil",
                fontSize = 32.sp,

            )
        }
    }
}