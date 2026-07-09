package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NavigationBar(
){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .height(85.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(28.dp))
            .background(Color.White)
    ) {

    }
}