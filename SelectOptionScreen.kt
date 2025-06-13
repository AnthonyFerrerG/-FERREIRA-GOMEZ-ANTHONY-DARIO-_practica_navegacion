package com.example.cupcake.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cupcake.ui.components.FormattedPriceLabel

@Composable
fun SelectOptionScreen(
    subtotal: Double,
    options: List<String>,
    onSelectionChanged: (String) -> Unit,
    onNextButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedOption by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = option == selectedOption,
                    onClick = {
                        selectedOption = option
                        onSelectionChanged(option)
                    }
                )
                Text(text = option)
            }
        }

        FormattedPriceLabel(price = subtotal)

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp)
        ) {
            Button(onClick = onCancelButtonClicked) {
                Text("Cancelar")
            }
            Button(
                onClick = onNextButtonClicked,
                enabled = selectedOption != null
            ) {
                Text("Siguiente")
            }
        }
    }
}
