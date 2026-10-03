package com.example.tugaslogin

import androidx.compose.runtime.Composable

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

            