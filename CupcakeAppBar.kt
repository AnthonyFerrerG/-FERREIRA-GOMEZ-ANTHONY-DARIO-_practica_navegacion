package com.example.cupcake.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.res.stringResource
import com.example.cupcake.R

@Composable
fun CupcakeAppBar(navController: NavController) {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name)) },
        navigationIcon = if (navController.previousBackStackEntry != null) {
            {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Atrás"
                    )
                }
            }
        } else null
    )
}
