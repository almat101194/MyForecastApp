package kz.almat.myforecast.data.network.response


import com.google.gson.annotations.SerializedName
import kz.almat.myforecast.data.db.entity.CurrentWeatherEntry
import kz.almat.myforecast.data.db.entity.Location

data class CurrentWeatherResponse(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)