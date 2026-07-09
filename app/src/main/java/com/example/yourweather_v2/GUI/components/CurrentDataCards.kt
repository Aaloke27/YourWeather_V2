package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yourweather_v2.model.CurrentWeatherUi

@Composable
fun CurrentDataCards(
    currentData: CurrentWeatherUi
){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(1f)
                .height(65.dp)
                .clip(shape = RoundedCornerShape(38.dp))
                .background(Color.White)
                .padding(start = 12.dp)

        ) {
            Icon(
                imageVector = Icons.Filled.Air,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(28.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy((-4).dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Wind",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "${currentData.windSpeed}km/h (NE)",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(1f)
                .height(65.dp)
                .clip(shape = RoundedCornerShape(38.dp))
                .background(Color.White)
                .padding(start = 12.dp)

        ) {
            Icon(
                imageVector = Icons.Filled.WaterDrop,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(28.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy((-4).dp),
                horizontalAlignment = Alignment.Start,

            ) {
                Text(
                    text = "Humidity: ${currentData.humidity}%",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Rain: ${currentData.precipitation}%",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}