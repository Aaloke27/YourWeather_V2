package com.example.yourweather_v2.viewModel

import androidx.lifecycle.ViewModel
import com.example.yourweather_v2.data.FakeWeatherData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class WeatherViewModel : ViewModel() {

    private val _uiState =
        MutableStateFlow(
            FakeWeatherData.weather
        )

    val uiState = _uiState.asStateFlow()

}