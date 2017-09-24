package com.innopolis.outside.domain.model

/**
 * @author Sergey Pinkevich
 */
data class ForecastList(val city: String,
                        val country: String,
                        val dailyForecastServerEntity: List<Forecast>)

data class Forecast(val date: String,
                    val city: String,
                    val country: String,
                    val description: String,
                    val currentTemperature: Int,
                    val humidity: Int,
                    val windDegree: Int,
                    val windSpeed: Int,
                    val weatherIcon: Int)

enum class TimeOfDay {
    DAY, NIGHT
}

enum class Weather {
    SUN, SNOW, RAIN, WIND, SNOW_RAIN, STORM, THUNDER
}