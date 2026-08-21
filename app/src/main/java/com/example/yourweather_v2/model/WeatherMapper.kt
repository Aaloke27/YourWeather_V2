package com.example.yourweather_v2.model


import com.example.yourweather_v2.model.api.WeatherResponse

fun WeatherResponse.toCurrentWeatherUi(): CurrentWeatherUi {

    return CurrentWeatherUi(
        city = name,
        currentTemp = main.temp.toInt(),
        highTemp = main.temp_max.toInt(),
        lowTemp = main.temp_min.toInt(),
        humidity = main.humidity,
        windSpeed = wind.speed.toInt(),
        precipitation = rain?.`1h`?.toInt() ?: 0,
        forecast = emptyList(),
        presentDataSet = emptyList()
    )
}