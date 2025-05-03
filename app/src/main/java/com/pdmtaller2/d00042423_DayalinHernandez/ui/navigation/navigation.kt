package com.pdmtaller2.d00042423_DayalinHernandez.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.d00042423_DayalinHernandez.ui.screens.RestaurantDetailScreen
import com.pdmtaller2.d00042423_DayalinHernandez.ui.screens.RestaurantsList
import com.pdmtaller2.d00042423_DayalinHernandez.ui.screens.orders
import com.pdmtaller2.d00042423_DayalinHernandez.ui.screens.search

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
NavHost(navController = navController, startDestination = "restaurantsList" ) {
    composable ("restaurantsList"){
        RestaurantsList(navController)
    }
    composable("detalle/{id}") { backStackEntry ->
        val id = backStackEntry.arguments?.getString("id") ?: return@composable
        RestaurantDetailScreen(navController, id, viewModel())
    }


    composable ("orders"){
        orders(navController)
    }

    composable ("search"){
        search(navController)
    }


 }
}