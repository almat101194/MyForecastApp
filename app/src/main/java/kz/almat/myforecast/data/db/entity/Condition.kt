package kz.almat.myforecast.data.db.entity


import com.google.gson.annotations.SerializedName

data class Condition(
    val text: String,
    val icon: String,
    val code: Int
)