package com.example.yourweather_v2.data.repository

import com.example.yourweather_v2.model.api.WeatherResponse
import com.example.yourweather_v2.network.RetrofitInstance

class WeatherRepository {

    suspend fun getCurrentWeather(
        city: String,
        apiKey: String
    ): WeatherResponse {
        return RetrofitInstance.api.getCurrentWeather(
            city = city,
            apiKey = apiKey
        )
    }
}