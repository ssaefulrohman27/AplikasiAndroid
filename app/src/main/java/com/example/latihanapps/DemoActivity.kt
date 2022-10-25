package com.example.latihanapps

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class DemoActivity :ComponentActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)

            ) {


                    Surface(
                    color = Color.Cyan,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Selamat Siang Bandung Hujan",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 12.dp, 16.dp, 12.dp),
                        color = Color.Blue,
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Hujan Dengan Kenangan",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 12.dp, 16.dp, 12.dp),
                        color = Color.Blue,
                        textAlign = TextAlign.Center

                    )
                }

            }
        }       }
}