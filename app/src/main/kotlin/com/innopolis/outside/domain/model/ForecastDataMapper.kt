package com.innopolis.outside.domain.model

import com.innopolis.outside.data.server.ForecastServerEntity
import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast as ModelForecast
import java.text.DateFormat
import java.util.*

/**
 * @author Sergey Pinkevich
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ServerResponse): ForecastList = ForecastList(forecast.city.name,
            forecast.city.country, convertForecastListToDomain(forecast.list))

    private fun convertForecastListToDomain(list: List<ForecastServerEntity>) = list.map { convertForecastToDomain(it) }

    private fun convertForecastToDomain(forecastServerEntity: ForecastServerEntity): ModelForecast =
            ModelForecast(convertDate(forecastServerEntity.dt), forecastServerEntity.weather[0].description,
                    forecastServerEntity.temp.max.toInt(), forecastServerEntity.temp.min.toInt())

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}