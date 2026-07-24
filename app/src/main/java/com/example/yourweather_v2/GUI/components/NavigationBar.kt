package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NavigationBar(
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .height(85.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(28.dp))
            .background(Color.White)
    ) {
        IconButton(onClick = {
        }){
            Icon(imageVector = Icons.Outlined.Home,
                contentDescription = "Home",
                modifier = Modifier.size(34.dp))
        }

        IconButton(onClick = {
        }){
            Icon(imageVector = Icons.Outlined.Search,
                contentDescription = "Search",
                modifier = Modifier.size(34.dp))
        }

        IconButton(onClick = {
        }){
            Icon(imageVector = Icons.Outlined.Settings,
                contentDescription = "Setting",
                modifier = Modifier.size(34.dp))
        }
    }
}