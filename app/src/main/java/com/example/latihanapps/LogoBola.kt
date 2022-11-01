package com.example.latihanapps

import android.accounts.AuthenticatorDescription
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.latihanapps.ui.theme.LatihanAppsTheme

class LogoBola : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanAppsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeApp()
                }

            }
        }
    }
}
@Composable
fun ComposeApp(){
    Column(Modifier.fillMaxWidth()) {
        Row( modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.persib),
                description = stringResource(R.string.),
                backgroundColor = ,
                modifier = )


        }

    }
}
@Composable
private fun ComposableInfoCard (
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier
    ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.persib),
            contentDescription = "PERSIB BANDUNG",
        modifier = Modifier
            .padding(bottom = 24.dp)
            .clip(RoundedCornerShape(percent = 50))
            .border(4.dp, Color.White, CircleShape)
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
        )
        Text(
            text = description,
        textAlign = TextAlign.Justify
        )

    }
}
@Preview(showBackground = true)
@Composable
fun LatihanApps {
    ComposeApp()
}
