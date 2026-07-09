package com.example.yourweather_v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.yourweather_v2.GUI.components.WeatherScreen
import com.example.yourweather_v2.ui.theme.YourWeather_V2Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge
        enableEdgeToEdge()

        // Draw behind system bars
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Hide status bar and navigation bar
        val controller = WindowInsetsControllerCompat(window, window.decorView)
        controller.hide(WindowInsetsCompat.Type.systemBars())

        // Allow bars to temporarily appear with a swipe
        controller.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        setContent {
            YourWeather_V2Theme {
                WeatherScreen()
            }
        }
    }
}