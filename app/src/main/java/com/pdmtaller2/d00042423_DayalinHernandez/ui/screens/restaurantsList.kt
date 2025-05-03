package com.pdmtaller2.d00042423_DayalinHernandez.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.BottomBar
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.FoodSpotTopBar
import com.pdmtaller2.d00042423_DayalinHernandez.viewmodel.FoodSpotViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.RestaurantCard
@Composable
fun RestaurantsList(
    navController: NavHostController,
    viewModel: FoodSpotViewModel = viewModel()
) {
    val restaurantCategories by viewModel.restaurantsByCategory.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFBF2EB)
    ) {
        Scaffold(
            topBar = { FoodSpotTopBar() },
            bottomBar = { BottomBar(navController) }
        ) { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                restaurantCategories.forEach { (category, restaurants) ->
                    item {
                        Column {
                            Text(
                                text = category,
                                style = MaterialTheme.typography.titleLarge,
                                color = MaterialTheme.colorScheme.primary
                            )

                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                                modifier = Modifier.padding(top = 8.dp)
                            ) {
                                items(restaurants) { restaurant ->
                                    RestaurantCard(
                                        restaurant = restaurant,
                                        onClick = {
                                            navController.navigate("detalle/${restaurant.id}")
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
