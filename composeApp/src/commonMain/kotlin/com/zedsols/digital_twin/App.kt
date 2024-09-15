package com.zedsols.digital_twin

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
  MaterialTheme {
    Column(
      Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      LoginScreen()
    }
  }
}

@Preview
@Composable
fun LoginScreen() {
  var email by remember { mutableStateOf("") }
  var password by remember { mutableStateOf("") }

  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    TextField(
      value = email,
      onValueChange = { email = it },
      label = { Text("Email") }
    )
    TextField(
      value = password,
      onValueChange = { password = it },
      label = { Text("Password") },
      visualTransformation = PasswordVisualTransformation()
    )
    Spacer(modifier = Modifier.height(16.dp))
    Button(
      shape = MaterialTheme.shapes.small,
      onClick = { println("Email: $email, Password: $password") },
    ) {
      Text("Login")
    }
    TextButton(
      onClick = { println("Navigate to Sign-Up") }) {
      Text("Don't have an account? Sign Up")
    }
  }
}
