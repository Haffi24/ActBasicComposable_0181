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