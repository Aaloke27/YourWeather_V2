package com.example.yourweather_v2.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.WbSunny
import com.example.yourweather_v2.model.CurrentWeatherUi
import com.example.yourweather_v2.model.ForecastUi

object FakeWeatherData {

    val weather = CurrentWeatherUi(
        city = "Khardah",
        currentTemp = 24,
        highTemp = 26,
        lowTemp = 16,
        humidity = 85,
        windSpeed = 12,
        precipitation = 70,

        forecast = listOf(
            ForecastUi(
                day = "Sat",
                temperature = 23,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Mon",
                temperature = 30,
                icon =  Icons.Outlined.Cloud
            ),

            ForecastUi(
                day = "Tue",
                temperature = 28,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi("Wed",
                Icons.Outlined.Cloud,
                26
            ),

            ForecastUi("Thu",
                Icons.Outlined.WbSunny,
                24
            ),

                    ForecastUi("Thu",
            Icons.Outlined.WbSunny,
            24
        ),
            ForecastUi("Thu",
                Icons.Outlined.WbSunny,
                24
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

        )
    )
}
