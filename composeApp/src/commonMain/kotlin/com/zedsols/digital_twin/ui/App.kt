package com.zedsols.digital_twin.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.zedsols.digital_twin.ui.navigation.NavGraph

@Composable
fun App() {
  val navController = rememberNavController()

  MaterialTheme {
    NavGraph(navController = navController)
  }
}
