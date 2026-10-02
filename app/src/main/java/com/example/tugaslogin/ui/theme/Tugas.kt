package com.example.tugaslogin.ui.theme

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
fun()