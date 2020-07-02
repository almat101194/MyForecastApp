package kz.almat.myforecast.data.network

import androidx.lifecycle.LiveData
import kz.almat.myforecast.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        language: String
    )
}
