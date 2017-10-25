package com.innopolis.outside.domain.model

/**
 * @author Sergey Pinkevich
 */
data class CurrentWeather(val date: String,
                          val city: String,
                          val country: String,
                          val currentTemperature: Int,
                          val humidity: Int,
                          val windSpeed: Int,
                          val weatherIcon: Int)