package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.WbSunny
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yourweather_v2.model.CurrentWeatherUi

@Composable
fun CurrentWeatherSection(
    weather: CurrentWeatherUi
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 18.dp)
        ) {
            Text(
                text = weather.currentTemp.toString()+ "°" + "C",
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                color = Color(0xff222B31)
            )
                Spacer(modifier = Modifier.width(10.dp))

            Icon(imageVector = Icons.Outlined.WbSunny,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .size(48.dp))
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(horizontal = 18.dp)
        ) {
            Text(text = "H:${weather.highTemp}°C | L:${weather.lowTemp}°C",
                fontSize = 24.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xff222B31))
        }
    }
}