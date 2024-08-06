package com.andre.dev.applite

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.andre.dev.applite.presentation.login.LogInScreen
import com.andre.dev.applite.presentation.signup.SignUpScreen
import com.andre.dev.applite.presentation.startup.StartUpScreen


@Composable
fun NavigationWrapper(navHostController: NavHostController) {
  NavHost(
    navController = navHostController,
    startDestination = "initial"
  ) {
    composable("initial") {
      StartUpScreen(
        navigateToLogin = { navHostController.navigate("logIn") },
        navigateToSignUp = { navHostController.navigate("signUp") },
        
        )
    }
    composable("logIn") {
      LogInScreen()
    }
    composable("signUp") {
      SignUpScreen()
    }
  }
}