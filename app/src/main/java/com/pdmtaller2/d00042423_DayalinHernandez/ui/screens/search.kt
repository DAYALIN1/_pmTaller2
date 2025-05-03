package com.pdmtaller2.d00042423_DayalinHernandez.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.BottomBar
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.FoodSpotTopBar

@Composable
fun search(navController: NavHostController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFBF2EB)
    ) {
        Scaffold(
            topBar = { FoodSpotTopBar() },
            bottomBar = { BottomBar(navController) }

        ){ paddingValues ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                color = Color(0xFFFBF2EB)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                }
            }}}
}
