package com.innopolis.outside.data.server

/**
 * @author Sergey Pinkevich
 */
data class ServerResponse(val location: Location,
                          val current: CurrentWeather)

data class Location(val name: String, val country: String)

data class CurrentWeather(val temp_c: Float,
                          val is_day: Int,
                          val wind_kph: Float,
                          val pressure_mb: Int,
                          val humidity: Int,
                          val cloud: Int,
                          val feelslike_c: Float)