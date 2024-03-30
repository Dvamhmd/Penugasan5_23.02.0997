package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigasi()
                }
            }
        }
    }
}



@Composable
fun Navigasi(){
    val nav = rememberNavController()
    NavHost(
        navController = nav,
        startDestination = "1",
        builder = {
            composable("1"){
                Awal(nav)
            }
            composable("2"+"/{pesan}"+"/{nama}"+"/{doa}"+"/{pengirim}"){navBackStack ->
                val name = navBackStack.arguments?.getString("nama")
                val wish = navBackStack.arguments?.getString("doa")
                val message = navBackStack.arguments?.getString("pesan")
                val sender = navBackStack.arguments?.getString("pengirim")

                Hasil(
                    nama = name!!,
                    doa = wish!!,
                    pesan = message!!,
                    pengirim = sender!!,
                    navController = nav

                )
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Navigasi()
    }
}