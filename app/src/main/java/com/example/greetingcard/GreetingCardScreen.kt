package com.example.greetingcard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

@Composable
fun GreetingCardScreen() {
    Surface(
        color = Color.Magenta,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp), // 画面上部の余白
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "私の名前は MizukiChan です！",
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingCardScreen() {
    GreetingCardTheme {
        GreetingCardScreen()
    }
}