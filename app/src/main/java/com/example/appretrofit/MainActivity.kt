package com.example.appretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appretrofit.ui.screens.ProductScreen
import com.example.appretrofit.ui.theme.AppRetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppRetrofitTheme {
                ProductScreen()
            }
        }
    }
}
