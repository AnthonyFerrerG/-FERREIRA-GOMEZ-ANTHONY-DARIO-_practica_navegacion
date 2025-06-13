package com.example.cupcake.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import java.text.NumberFormat
import java.util.*

@Composable
fun FormattedPriceLabel(price: Double) {
    val formattedPrice = NumberFormat.getCurrencyInstance(Locale.getDefault()).format(price)
    Text(text = "Subtotal: $formattedPrice")
}
