package com.example.cupcake.data

data class OrderUiState(
    val quantity: Int = 0,
    val flavor: String = "",
    val date: String = "",
    val price: Double = 0.0,
    val pickupOptions: List<String> = emptyList()
)
