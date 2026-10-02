package com.example.tugaslogin.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable

@Composable
    fun TataletakColumn(modifier: Modifier) {
        Coloumn(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
            Text(text = "Komponen1")
            Text(text = "Komponen2")
            Text(text = "Komponen3")
            Text(text = "Komponen4")
        }
    }

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataLetakBox(modifier: Modifier) {
    BOX(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Coloumn 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Coloumn 2")
    }
}

@Composable
fun TataLetakColumnRow(modifier: Modifier) {
    Column() {
        //Baris1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
    }
        //Baris2
        Row(modifier = modifier.FillMaxWidth(),
            hotizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataLetakRowColumn(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),horizontalArrangement = Arrangement,SpaceEvenly) {
        //  Kolom1
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        //Kolom2
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun()


