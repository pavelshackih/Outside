package com.innopolis.outside.domain.model

import com.innopolis.outside.R
import com.innopolis.outside.common.toDateString
import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast as ModelForecast

/**
 * @author Sergey Pinkevich
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ServerResponse) = ModelForecast(forecast.dt.toDateString(),
            forecast.weather[0].main, forecast.main.temp.toInt(), forecast.main.humidity.toInt(),
            forecast.wind.speed.toInt(), WeatherIconConverter(forecast).weatherIconDrawable())

    /**
     * Convert the degree to the string equivalent
     * For example, 0° -> north, 52° -> northeast
     * @return id of the string resource
     */
    private fun convertFromWindDegree(degree: Float): Int {
        val sideWorldsList = listOf(R.array.worldsides)
        val changedDegree = degree + 22.5
        return sideWorldsList[(changedDegree / 8).toInt()]
    }
}