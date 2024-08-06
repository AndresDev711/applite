package com.andre.dev.applite.presentation.login

import android.view.Gravity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Preview
@Composable
fun LogInScreen() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(
        Brush.verticalGradient(
          listOf(Gray, Black),
          startY = 0f,
          endY = 600f
        )
      ),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Spacer(modifier = Modifier.weight(1f))
    Image(
      painter = painterResource(id = R.drawable.ic_launcher_foreground),
      contentDescription = "AppIcon",
      modifier = Modifier.clip(CircleShape)
    )
    Spacer(modifier = Modifier.weight(1f))
    Text(
      text = "Eslogan de tu Empresa",
      color = Color.White,
      fontSize = 30.sp,
      fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.weight(1f))
    Button(
      onClick = {},
      modifier = Modifier
        .fillMaxWidth()
        .height(48.dp)
        .padding(horizontal = 32.dp),
      colors = ButtonDefaults.buttonColors(containerColor = Green)
    ) {
      Text(text = "SIGN UP")
    }
    Spacer(modifier = Modifier.height(10.dp))
    CustomButton("SignIn with Google")
    Spacer(modifier = Modifier.height(10.dp))
    CustomButton("SignIn with Facebook")
    Spacer(modifier = Modifier.height(10.dp))
    Text(
      text = "Sign In",
      color = Color.White,
      fontSize = 20.sp,
      fontWeight = FontWeight.Bold,
      modifier = Modifier.fillMaxWidth(),
      textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(30.dp))
  }
}

@Composable
fun CustomButton(buttonText: String) {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .height(48.dp)
      .padding(horizontal = 32.dp)
      .border(1.dp, color = Color.White, shape = CircleShape)
      .clickable { },
    contentAlignment = Alignment.CenterStart,
    
    ) {
    Image(
      painter = painterResource(id = R.drawable.ic_launcher_foreground),
      contentDescription = "customIcon",
      modifier = Modifier
        .padding(horizontal = 10.dp)
        .size(40.dp)
    )
    Text(
      text = buttonText,
      color = Color.White,
      fontSize = 20.sp,
      fontWeight = FontWeight.Bold,
      modifier = Modifier.fillMaxWidth(),
      textAlign = TextAlign.Center
    )
  }
  
}