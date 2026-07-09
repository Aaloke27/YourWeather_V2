package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yourweather_v2.model.ForecastUi

@Composable
fun ForecastCard(
  forecastUi: ForecastUi
){
    Card(
        modifier = Modifier
            .width(85.dp)
            .height(145.dp)
            .padding(horizontal = 2.dp),
        shape = RoundedCornerShape(22.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp)
        ) {
            Text(
                text = forecastUi.day,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )

            Icon(
                imageVector = forecastUi.icon,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                tint = Color.DarkGray
            )

            Text(
                text = "${forecastUi.temperature}°C",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
    }
}