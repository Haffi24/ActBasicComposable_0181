package com.example.tugaslogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun  HalamanProfil(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text = "Haffi Saifulloh",
                color = Color.Blue,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "20240140181",
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Box(
                modifier = Modifier
                    .size(260.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8EAF6))
                    .border(width = 4.dp, color = Color.White, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gambar_profil),
                    contentDescription = "Gambar Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(130.dp)
                )
            }
        }
    }
}
