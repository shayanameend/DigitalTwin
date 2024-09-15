package com.zedsols.digital_twin.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
  Column {
    Text("Home")
    Button(onClick = { navController.navigate("sign-in") }) {
      Text("Go to Sign In")
    }
    Button(onClick = { navController.navigate("sign-up") }) {
      Text("Go to Sign Up")
    }
  }
}
