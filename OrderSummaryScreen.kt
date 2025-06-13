package com.example.cupcake.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cupcake.data.OrderUiState
import com.example.cupcake.ui.components.FormattedPriceLabel

@Composable
fun OrderSummaryScreen(
    orderUiState: OrderUiState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(text = "Resumen del pedido")
        Text(text = "Cantidad: ${orderUiState.quantity}")
        Text(text = "Sabor: ${orderUiState.flavor}")
        Text(text = "Fecha de retiro: ${orderUiState.date}")
        FormattedPriceLabel(price = orderUiState.price)

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp)
        ) {
            Button(onClick = onCancelButtonClicked) {
                Text("Cancelar")
            }
            Button(onClick = { /* Aquí puede ir lógica para enviar pedido */ }) {
                Text("Enviar pedido")
            }
        }
    }
}
