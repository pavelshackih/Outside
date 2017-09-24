package com.innopolis.outside.domain.model

import com.innopolis.outside.R
import com.innopolis.outside.common.toDateString
import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast as ModelForecast

/**
 * @author Sergey Pinkevich
 */
class ForecastDataMapper {

    fun convertFromDataModel(forecast: ServerResponse) = ModelForecast(
            forecast.dt.toDateString(),
            forecast.name,
            forecast.sys.country,
            forecast.weather[0].main,
            forecast.main.temp.toInt(),
            forecast.main.humidity.toInt(),
            forecast.wind.deg.toInt(),
            forecast.wind.speed.toInt(),
            WeatherIconConverter(forecast).weatherIconDrawable())
}