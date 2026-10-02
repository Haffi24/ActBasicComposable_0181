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

