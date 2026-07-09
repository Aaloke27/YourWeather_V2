package com.example.yourweather_v2.GUI.components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.yourweather_v2.data.FakeWeatherData
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
                .weight(1f)
                .padding(top = 18.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Column() {
                Spacer(modifier = Modifier.height(12.dp))
                LocationCard()
                Spacer(modifier = Modifier.height(30.dp))
                CurrentWeatherSection(weather)
                Spacer(modifier = Modifier.height(30.dp))
                CurrentDataCards(weather)
                Spacer(modifier = Modifier.height(30.dp))
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(38.dp))
                        .verticalScroll(rememberScrollState())

                ) {
                    UpcomingDataCards(FakeWeatherData)
                    Spacer(modifier = Modifier.height(20.dp))
                    PresentWeatherDataSet(
                        weather = FakeWeatherData.weather
                    )
                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        NavigationBar()
    }

}



