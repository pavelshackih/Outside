package com.innopolis.outside.data.server

/**
 * @author Sergey Pinkevich
 */
data class City(val id: Long,
                val name: String,
                val coord: Coordinates,
                val country: String,
                val population: Int)

data class Coordinates(val lat: Float,
                       val lon: Float)

data class ForecastServerEntity(val dt: Long,
                                val temp: Temperature,
                                val pressure: Float,
                                val humidity: Int,
                                val weather: List<Weather>,
                                val speed: Float,
                                val deg: Int)

data class ServerResponse(val city: City, val list: List<ForecastServerEntity>)

data class Temperature(val day: Float,
                       val min: Float,
                       val max: Float,
                       val night: Float,
                       val eve: Float,
                       val morn: Float)

data class Weather(val id: Long,
                   val main: String,
                   val description: String,
                   val icon: String)