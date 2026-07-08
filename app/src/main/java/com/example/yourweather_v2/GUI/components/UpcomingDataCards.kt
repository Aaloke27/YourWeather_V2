package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.WbSunny
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.yourweather_v2.GUI.components.ForecastCard
import com.example.yourweather_v2.data.FakeWeatherData
import com.example.yourweather_v2.model.ForecastUi

@Composable
fun UpcomingDataCards(
    forecastList: FakeWeatherData
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),

    ) {
        items(forecastList.weather.forecast) { forecast ->
            ForecastCard(forecast)
        }
    }
}