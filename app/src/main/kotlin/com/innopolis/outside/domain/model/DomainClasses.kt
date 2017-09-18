package com.innopolis.outside.domain.model

/**
 * @author Sergey Pinkevich
 */
data class ForecastList(val city: String,
                        val country: String,
                        val dailyForecastServerEntity: List<Forecast>)

data class Forecast(val date: String,
                    val description: String,
                    val currentTemperature: Int,
                    val humidity: Int,
                    val windSpeed: Int)