package com.example.tugaslogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komp 1")
        Text(text = "Komp 2")
        Text(text = "Komp 3")
        Text(text = "Komp 4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komp 1")
        Text(text = "Komp 2")
        Text(text = "Komp 3")
        Text(text = "Komp 4")
    }
}

@Composable
fun TataLetakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataLetakColumnRow(modifier: Modifier) {
    Column {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komp 1 Baris 1")
            Text(text = "Komp 2 Baris 1")
            Text(text = "Komp 3 Baris 1")
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komp 1 Baris 2")
            Text(text = "Komp 2 Baris 2")
            Text(text = "Komp 3 Baris 2")
        }
    }
}

@Composable
fun TataLetakRowColumn(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komp 1 Kolom 1")
            Text(text = "Komp 2 Kolom 1")
            Text(text = "Komp 3 Kolom 1")
        }
        Column {
            Text(text = "Komp 1 Kolom 2")
            Text(text = "Komp 2 Kolom 2")
            Text(text = "Komp 3 Kolom 2")
        }
    }
}

@Composable
fun TataLetakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.notasibalok)

    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Komp 1")
                    Text(text = "Komp 2")
                    Text(text = "Komp 3")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Komp 4")
                    Text(text = "Komp 5")
                    Text(text = "Komp 6")
                }
            }
        }

        Spacer(modifier = Modifier.height(height = 10.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 300.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My music",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(alignment = Alignment.Center)
            )
        }
    }
}