package com.innopolis.outside.domain.model

import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast as ModelForecast

/**
 * @author Sergey Pinkevich
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ServerResponse) = ModelForecast(
            "123",
            forecast.location.name,
            forecast.location.country,
            forecast.current.temp_c.toInt(),
            forecast.current.humidity,
            forecast.current.wind_kph.toInt(),
            WeatherIconConverter(forecast).weatherIconDrawable())
}