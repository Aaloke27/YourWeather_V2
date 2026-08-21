package com.example.yourweather_v2.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yourweather_v2.BuildConfig
import com.example.yourweather_v2.data.repository.WeatherRepository
import com.example.yourweather_v2.model.WeatherUiState
import com.example.yourweather_v2.model.toCurrentWeatherUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class WeatherViewModel(
    private val repository: WeatherRepository
) : ViewModel() {

    private val _uiState =
        MutableStateFlow<WeatherUiState>(
            WeatherUiState.Loading
        )

    val uiState = _uiState.asStateFlow()

    fun getCurrentWeather(city: String) {

        viewModelScope.launch {

            _uiState.value = WeatherUiState.Loading

            try {

                val response = repository.getCurrentWeather(
                    city = city,
                    apiKey = BuildConfig.OPENWEATHER_API_KEY
                )

                val weather = response.toCurrentWeatherUi()

                _uiState.value = WeatherUiState.Success(weather)

            } catch (e: Exception) {

                _uiState.value = WeatherUiState.Error(
                    message = e.message ?: "Something went wrong"
                )
            }
        }
    }
}