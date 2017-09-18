package com.innopolis.outside.domain.model

import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast as ModelForecast
import java.text.DateFormat
import java.util.*

/**
 * @author Sergey Pinkevich
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ServerResponse) = ModelForecast(convertDate(forecast.dt),
            forecast.weather[0].main, forecast.main.temp.toInt(), forecast.main.humidity.toInt(),
            forecast.wind.speed.toInt())

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}