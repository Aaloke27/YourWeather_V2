package com.example.yourweather_v2.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WbTwilight
import androidx.compose.material.icons.outlined.AlignVerticalBottom
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.CloudUpload
import androidx.compose.material.icons.outlined.DeviceThermostat
import androidx.compose.material.icons.outlined.RemoveRedEye
import androidx.compose.material.icons.outlined.WbSunny
import com.example.yourweather_v2.R
import com.example.yourweather_v2.model.CurrentWeatherUi
import com.example.yourweather_v2.model.ForecastUi
import com.example.yourweather_v2.model.PresentDataSet

object FakeWeatherData {

    val weather = CurrentWeatherUi(
        city = "Khardah",
        currentTemp = 24,
        highTemp = 26,
        lowTemp = 16,
        humidity = 85,
        windSpeed = 12,
        precipitation = 70,

        forecast = listOf(
            ForecastUi(
                day = "Sat",
                temperature = 23,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Mon",
                temperature = 30,
                icon = Icons.Outlined.Cloud
            ),

            ForecastUi(
                day = "Tue",
                temperature = 28,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                "Wed",
                Icons.Outlined.Cloud,
                26
            ),

            ForecastUi(
                "Thu",
                Icons.Outlined.WbSunny,
                24
            ),

            ForecastUi(
                "Thu",
                Icons.Outlined.WbSunny,
                24
            ),
            ForecastUi(
                "Thu",
                Icons.Outlined.WbSunny,
                24
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

            ForecastUi(
                day = "Sun",
                temperature = 25,
                icon = Icons.Outlined.WbSunny
            ),

            ),
        presentDataSet = listOf(

            PresentDataSet(
                icon = Icons.Outlined.DeviceThermostat,
                value = "Feels Like",
                data = "24°C"
            ),

            PresentDataSet(
                icon = Icons.Outlined.RemoveRedEye,
                value = "Visibility",
                data = "5 km"
            ),

            PresentDataSet(
                icon = Icons.Outlined.AlignVerticalBottom,
                value = "Pressure",
                data = "1012 hPa"
            ),

            PresentDataSet(
                icon = Icons.Filled.WbTwilight,
                value = "Sunrise",
                data = "6:12 AM"
            ),

            PresentDataSet(
                icon = Icons.Outlined.Cloud,
                value = "AQI",
                data = "104"
            ),

            PresentDataSet(
                iconRes = R.drawable.sunset,
                value = "Sunset",
                data = "6:02 PM"
            )
        )

    )
}
