package com.pdmtaller2.d00042423_DayalinHernandez.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.pdmtaller2.d00042423_DayalinHernandez.model.Dish
import com.pdmtaller2.d00042423_DayalinHernandez.ui.components.FoodSpotTopBar
import com.pdmtaller2.d00042423_DayalinHernandez.viewmodel.FoodSpotViewModel

@Composable
fun RestaurantDetailScreen(
    navController: NavHostController,
    restaurantId: String,
    viewModel: FoodSpotViewModel
) {
    val context = LocalContext.current
    val restaurant = viewModel.getRestaurantById(restaurantId)
    var searchText by remember { mutableStateOf(TextFieldValue("")) }

    val filteredDishes = remember(searchText, restaurant) {
        restaurant?.menu?.filter {
            it.name.contains(searchText.text, ignoreCase = true)
        } ?: emptyList()
    }


    Scaffold(
        topBar = {
            FoodSpotTopBar(
                    title = restaurant?.name ?: "Detalles",
                    showBackButton = true,
                    onBackClick = { navController.popBackStack() }
                )


        },
        containerColor = Color(0xFFFBF2EB)
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            restaurant?.let {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                ) {
                    Text(text = it.name, style = MaterialTheme.typography.headlineSmall)
                    Text(text = it.description, style = MaterialTheme.typography.bodyMedium)
                    Text(text = "Ubicación: ${it.location}", style = MaterialTheme.typography.bodySmall)
                    Text(
                        text = "Categorías: ${it.categories.joinToString()}",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }


            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Buscar platillo") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(filteredDishes) { dish ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            AsyncImage(
                                model = dish.imgURL,
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Text(dish.name, style = MaterialTheme.typography.titleMedium)
                            Text(dish.description, style = MaterialTheme.typography.bodyMedium)

                            Button(
                                onClick = {
                                    Toast.makeText(
                                        context,
                                        "${dish.name} agregado al carrito",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                },
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .padding(top = 8.dp)
                            ) {
                                Text("Agregar al carrito")
                            }
                        }
                    }
                }
            }
        }
    }
}
