package com.example.yourweather_v2.model

import androidx.compose.ui.graphics.vector.ImageVector

data class ForecastUi(
    val day: String,
    val icon: ImageVector,
    val temperature: Int
)