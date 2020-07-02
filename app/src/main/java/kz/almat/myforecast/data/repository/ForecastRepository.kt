package kz.almat.myforecast.data.repository

import androidx.lifecycle.LiveData
import kz.almat.myforecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}