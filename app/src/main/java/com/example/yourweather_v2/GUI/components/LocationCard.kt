package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yourweather_v2.data.FakeWeatherData

@Composable
fun LocationCard(
) {
    Box(
        modifier = Modifier
            .fillMaxHeight(0.1f)
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(34.dp),
            )
            .clip(shape = RoundedCornerShape(34.dp))
            .background(Color.White)

    ){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(start = 18.dp)
                .align(Alignment.CenterStart)
        ) {
            Text(
                text = "City",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = FakeWeatherData.weather.city,
                fontSize = 26.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
        }

    }
}