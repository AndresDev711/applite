package com.andre.dev.applite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.andre.dev.applite.ui.theme.AppLiteTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
  
  private lateinit var navHostController: NavHostController
  private lateinit var auth: FirebaseAuth
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    auth = Firebase.auth
    enableEdgeToEdge()
    
    setContent {
      navHostController = rememberNavController()
      
      AppLiteTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          NavigationWrapper(navHostController, auth)
        }
      }
    }
  }
  
  override fun onStart() {
    super.onStart()
    val currentUser = auth.currentUser
    if (currentUser != null) {
      //move to home
    }
    
    
  }
  
}
