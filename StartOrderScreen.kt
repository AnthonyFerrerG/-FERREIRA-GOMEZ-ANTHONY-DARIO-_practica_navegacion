package com.example.cupcake.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StartOrderScreen(
    quantityOptions: List<Int>,
    modifier: Modifier = Modifier,
    onNextButtonClicked: (Int) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "¿Cuántas magdalenas quieres?")
        quantityOptions.forEach { quantity ->
            Button(onClick = { onNextButtonClicked(quantity) }) {
                Text(text = quantity.toString())
            }
        }
    }
}
