package kz.almat.myforecast.ui.weather.current

import androidx.lifecycle.ViewModel
import kz.almat.myforecast.data.repository.ForecastRepository
import kz.almat.myforecast.internal.UnitSystem
import kz.almat.myforecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private  val unitSystem = UnitSystem.METRIC

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
