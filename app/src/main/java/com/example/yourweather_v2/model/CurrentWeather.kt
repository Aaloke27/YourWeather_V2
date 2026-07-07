package com.example.yourweather_v2.model

data class CurrentWeatherUi(
    val city: String,
    val currentTemp: Int,
    val highTemp: Int,
    val lowTemp: Int,
    val humidity: Int,
    val windSpeed: Int,
    val precipitation: Int,
    val forecast: List<ForecastUi>
)