package com.example.yourweather_v2.network


import com.example.yourweather_v2.model.api.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appId") apiKey: String,
        @Query("units") units: String = "metric"
    ): WeatherResponse
}