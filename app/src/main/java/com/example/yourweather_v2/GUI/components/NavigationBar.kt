package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Apartment
import androidx.compose.material.icons.outlined.Business
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Villa
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.selects.select

@Composable
fun NavigationBar(
){
    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationBar(
        containerColor = Color.White,
        modifier = Modifier.clip(
            shape = RoundedCornerShape(
                topStart = 18.dp,
                topEnd = 18.dp)
        )
    ){

        NavigationBarItem(
            selected = selectedItem == 0,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Black,
                selectedTextColor = Color.Black,
                indicatorColor = Color(0xFFCFE2E9)
            ),
            onClick = {
               selectedItem = 0
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Villa,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = {Text("Home")}
        )

        NavigationBarItem(
            selected = selectedItem == 1,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Black,
                selectedTextColor = Color.Black,
                indicatorColor = Color(0xFFCFE2E9)
            ),
            onClick = {
                selectedItem = 1
            },
            icon = {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = {Text("Home")}
        )

        NavigationBarItem(
            selected = selectedItem == 3,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Black,
                selectedTextColor = Color.Black,
                indicatorColor = Color(0xFFCFE2E9)
            ),
            onClick = {
                selectedItem = 3
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = {Text("Home")}
        )
    }
}