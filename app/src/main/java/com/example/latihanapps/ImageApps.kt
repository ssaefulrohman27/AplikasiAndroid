package com.example.latihanapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.content.res.Resources
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class ImageApps : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showImageApps()
        }
    }
}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showImageApps() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xFF4934EB),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arema),
                        contentDescription = "Arema FC",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "AREMA FC",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "MALANG",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff00176c),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.persib),
                        contentDescription = stringResource(R.string.persib),
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "PERSIB BANDUNG",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "BANDUNG",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffff8242),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.persija),
                        contentDescription = stringResource(R.string.persija),
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(12.dp)
                    )
                    Text(
                        text = "PERSIJA",
                        fontSize = 16.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "JAKARTA",
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xff008000),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.persebaya),
                        contentDescription = "PERSEBAYA",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = stringResource(R.string.persebaya),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "SURABAYA",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff6CABDD),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.persigar),
                        contentDescription = "PERSIGAR",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "PERSIGAR",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "GARUT",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffd7ea04),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.persikab),
                        contentDescription = "PERSIKAB",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "PERSIKAB",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "KABUPATEN BANDUNG",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}