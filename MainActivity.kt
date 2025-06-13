package com.example.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cupcake.ui.CupcakeApp
import com.example.cupcake.ui.theme.CupcakeTheme
import com.example.cupcake.data.OrderViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeTheme {
                val viewModel: OrderViewModel = viewModel()
                CupcakeApp(viewModel = viewModel)
            }
        }
    }
}
