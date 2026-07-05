package com.example.yourweather_v2.data

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

        forecast = listOf(
            ForecastUi(
                day = "Sat",
                temperature = 23,
                icon = 0
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = 0
            ),

            ForecastUi(
                day = "Mon",
                temperature = 30,
                icon = 0
            ),

            ForecastUi(
                day = "Tue",
                temperature = 28,
                icon = 0
            )
        )
    )
}
