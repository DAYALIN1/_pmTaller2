package com.pdmtaller2.d00042423_DayalinHernandez.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imgURL: String,
    val location: String,
    val categories: List<String>,
    val menu: List<Dish>
)