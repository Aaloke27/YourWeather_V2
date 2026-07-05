package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.yourweather_v2.viewModel.WeatherViewModel
import java.nio.file.WatchEvent

@Composable
fun WeatherScreen(
    viewModel: WeatherViewModel = viewModel()
) {

    val weather by viewModel.uiState.collectAsState()

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xffCFE2E9))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .fillMaxHeight(0.3f)
                .padding(top = 18.dp)
        ) {
            LocationCard()
        }

    }

}


