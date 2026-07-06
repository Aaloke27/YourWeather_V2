# 🌤 Weather App V2

A modern Android weather application built with Kotlin and Jetpack Compose. This project was rebuilt as **Weather App V2** to strengthen Android development fundamentals while following modern Android architecture and best practices.

The app fetches real-time weather information and focuses on learning concepts such as API integration, state management, MVVM architecture, asynchronous programming, and modern UI design.

## ✨ Features

* Search weather by city
* Fetch real-time weather data
* Display temperature and weather conditions
* Dynamic weather UI
* Save and load last searched city
* Responsive Material 3 design
* State management using ViewModel
* Smooth asynchronous data loading with Coroutines
* Modern UI built entirely with Jetpack Compose

## 🛠 Tech Stack

* **Language:** Kotlin
* **UI:** Jetpack Compose
* **Architecture:** MVVM (Model–View–ViewModel)
* **Networking:** Retrofit
* **Asynchronous Programming:** Kotlin Coroutines
* **Design System:** Material 3
* **Backend/Storage:** Firebase
* **API:** OpenWeatherMap API

## 🏗 Architecture

The project follows an MVVM architecture:

```text
UI (Jetpack Compose)
        ↓
ViewModel
        ↓
Repository
        ↓
API / Firebase
```

This structure helps keep business logic separate from UI logic, making the app easier to maintain and scale.

## 📂 Project Structure

```text
WeatherAppV2/
│
├── ui/
│   ├── screens/
│   ├── components/
│   └── theme/
│
├── data/
│   ├── api/
│   ├── repository/
│   └── models/
│
├── viewmodel/
│
├── firebase/
│
└── MainActivity.kt
```

## 🎯 Concepts Practiced In This Project

* Jetpack Compose UI development
* MVVM architecture
* API integration using Retrofit
* State management
* Coroutines
* Firebase integration
* Clean project organization
* Modern Android app development practices

## 🚀 Future Improvements

* 5–7 day weather forecast
* Weather animations
* Location-based weather detection
* Dark mode improvements
* Better error handling
* Additional weather statistics
* Improved UI polish

## 📸 Screenshots

Add screenshots here

## 👨‍💻 Author

Built by Aaloke Das as part of learning and improving Android development skills.
