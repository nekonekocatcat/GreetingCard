package com.example.greetingcard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // メインのテキスト
            Text(
                text = "私の名前は MizukiChan です！",
                color = Color.White,
                fontSize = 27.sp,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "My name is MizukiChan!",
                color = Color.White.copy(alpha = 0.6f),
                fontSize = 28.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Monospace,
                style = TextStyle(letterSpacing = 0.5.sp),
                modifier = Modifier
                    .offset(x = 1.dp, y = -2.dp)
            )
            Text(
                text = "我叫 MizukiChan！",
                color = Color.White.copy(alpha = 0.3f),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                style = TextStyle(letterSpacing = 0.5.sp),
                modifier = Modifier
                    .offset(x = 2.dp, y = -1.dp)
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
