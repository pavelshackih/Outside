package com.innopolis.outside.data.server

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

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

data class Wind(val speed: Float,
                val deg: Float)

data class Clouds(val all: Int)

data class ServerResponse(val coord: Coordinates,
                          val weather: List<Weather>,
                          val main: ForecastInfo,
                          val wind: Wind,
                          val clouds: Clouds,
                          val rain: Rain,
                          val snow: Snow,
                          val dt: Long,
                          val name: String)

class Rain {
    @SerializedName("3h")
    @Expose
    var rainVolume: Float = 0.0F
}

class Snow {
    @SerializedName("3h")
    @Expose
    var snowVolume: Float = 0.0F
}

data class ForecastInfo(val temp: Float,
                        val temp_min: Float,
                        val temp_max: Float,
                        val humidity: Float,
                        val pressure: Float)

data class Weather(val id: Long,
                   val main: String,
                   val description: String,
                   val icon: String)