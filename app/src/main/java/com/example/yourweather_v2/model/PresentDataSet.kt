package com.example.yourweather_v2.model

import androidx.compose.ui.graphics.vector.ImageVector

data class PresentDataSet(
    val icon: ImageVector? = null,
    val iconRes: Int? = null,
    val value: String,
    val data: String
)