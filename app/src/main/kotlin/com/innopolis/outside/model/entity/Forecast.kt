package com.innopolis.outside.model.entity

/**
 * @author Sergey Pinkevich
 */
data class Forecast(val dt: Long,
                    val temp: Temperature,
                    val pressure: Float,
                    val humidity: Int,
                    val weather: List<Weather>,
                    val speed: Float,
                    val deg: Int)