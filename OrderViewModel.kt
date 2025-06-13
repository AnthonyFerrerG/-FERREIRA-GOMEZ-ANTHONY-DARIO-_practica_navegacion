package com.example.cupcake.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import java.text.SimpleDateFormat
import java.util.*

class OrderViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(OrderUiState(pickupOptions = generatePickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState

    fun setQuantity(quantity: Int) {
        _uiState.update {
            it.copy(quantity = quantity, price = calculatePrice(quantity, it.flavor))
        }
    }

    fun setFlavor(flavor: String) {
        _uiState.update {
            it.copy(flavor = flavor, price = calculatePrice(it.quantity, flavor))
        }
    }

    fun setDate(date: String) {
        _uiState.update { it.copy(date = date) }
    }

    fun resetOrder() {
        _uiState.value = OrderUiState(pickupOptions = generatePickupOptions())
    }

    private fun calculatePrice(quantity: Int, flavor: String): Double {
        val basePrice = 2.0
        return quantity * basePrice
    }

    private fun generatePickupOptions(): List<String> {
        val options = mutableListOf<String>()
        val formatter = SimpleDateFormat("EEE MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        repeat(4) {
            options.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return options
    }
}
