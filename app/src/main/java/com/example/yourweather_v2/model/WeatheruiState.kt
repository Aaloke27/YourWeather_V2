package com.example.yourweather_v2.model

sealed interface WeatherUiState {

    data object Loading : WeatherUiState

    data class Success(
        val weather: CurrentWeatherUi
    ) : WeatherUiState

    data class Error(
        val message: String
    ) : WeatherUiState
}