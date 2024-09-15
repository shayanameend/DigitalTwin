package com.zedsols.digital_twin.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zedsols.digital_twin.ui.screens.Home
import com.zedsols.digital_twin.ui.screens.SignIn
import com.zedsols.digital_twin.ui.screens.SignUp

@Composable
fun NavGraph(navController: NavHostController) {
  NavHost(navController = navController, startDestination = "home") {
    composable("home") { Home(navController) }
    composable("sign-in") { SignIn(navController) }
    composable("sign-up") { SignUp(navController) }
  }
}
