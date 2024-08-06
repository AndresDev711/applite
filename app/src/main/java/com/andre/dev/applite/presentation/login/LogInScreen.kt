package com.andre.dev.applite.presentation.login

import android.util.Log
import android.view.Gravity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andre.dev.applite.R
import com.andre.dev.applite.ui.theme.Black
import com.andre.dev.applite.ui.theme.Gray
import com.andre.dev.applite.ui.theme.Green
import com.andre.dev.applite.ui.theme.SelectedField
import com.andre.dev.applite.ui.theme.UnselectedField
import com.google.firebase.auth.FirebaseAuth

@Composable
fun LogInScreen(auth: FirebaseAuth) {
  var email by remember { mutableStateOf("") }
  var password by remember { mutableStateOf("") }
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(Black)
      .padding(horizontal = 32.dp),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    
    Row() {
      Icon(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "",
        tint = Color.White,
        modifier = Modifier
          .padding(vertical = 24.dp)
          .size(24.dp)
      )
      Spacer(modifier = Modifier.weight(1f))
    }
    
    Text(
      "Email",
      color = Color.White,
      fontWeight = FontWeight.Bold,
      fontSize = 40.sp
    )
    TextField(
      value = email,
      onValueChange = { email = it },
      modifier = Modifier.fillMaxWidth(),
      colors = TextFieldDefaults.colors(
        unfocusedContainerColor = UnselectedField,
        focusedContainerColor = SelectedField
      )
    )
    Spacer(Modifier.height(48.dp))
    Text(
      "Password",
      color = Color.White,
      fontWeight = FontWeight.Bold,
      fontSize = 40.sp
    )
    TextField(
      value = password, onValueChange = { password = it },
      modifier = Modifier.fillMaxWidth(),
      colors = TextFieldDefaults.colors(
        unfocusedContainerColor = UnselectedField,
        focusedContainerColor = SelectedField
      )
    )
    Spacer(Modifier.height(48.dp))
    Button(onClick = {
      auth
        .signInWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
          if (task.isSuccessful) {
            //Navegar
            Log.i("check_login", "LOGIN Success")
          } else {
            //Error
            Log.i("check_login", "LOGIN error")
          }
        }
    }) {
      Text(text = "Login")
    }
  }
  
  
}

