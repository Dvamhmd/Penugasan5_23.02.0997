package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Hasil(pesan: String, nama: String, doa: String, pengirim: String, navController: NavController){

    Surface(
        color = Color.White
    ) {
        Image(
            painter = painterResource(id = R.drawable.sky),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.7f
        )
    }



    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ){
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            tint = Color.DarkGray,
            modifier = Modifier
                .size(50.dp)
                .clickable { navController.navigate("1") }
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "~$pesan~",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontFamily = FontFamily.Serif,
            color = Color.Black
        )
        
        Spacer(modifier = Modifier.height(20.dp))
        
        Box (contentAlignment = Alignment.TopCenter){
            Image(
                painter = painterResource(id = R.drawable.frame),
                contentDescription = null
            )
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text = nama,
                    fontSize = 60.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    lineHeight = 60.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Magenta,
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.DarkGray,
                            offset = Offset(5.0f,7.0f),
                            blurRadius = 6f
                        )
                    )
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = doa,
                    color = Color.Black,
                    lineHeight = 28.sp,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Serif,
                    fontSize = 24.sp,

                )
            }

        }
    }
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End,
    ){
        Text(
            text = "From",
            color = Color.Black,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif ,
            modifier = Modifier
                    .padding(end = 10.dp)
        )
        Text(
            text = pengirim,
            color = Color.Black,
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(end = 10.dp, bottom = 15.dp)
        )
    }
}