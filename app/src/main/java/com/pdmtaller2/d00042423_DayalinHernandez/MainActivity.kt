package com.pdmtaller2.d00042423_DayalinHernandez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.pdmtaller2.d00042423_DayalinHernandez.ui.navigation.AppNavigation
import com.pdmtaller2.d00042423_DayalinHernandez.ui.theme.FoodSpotByAgarciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByAgarciaTheme {
                AppNavigation()
            }
        }
    }
}
