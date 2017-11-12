package com.innopolis.outside.domain.converter

import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.CurrentWeather
import com.innopolis.outside.domain.model.WeatherIconConverter

/**
 * @author Sergey Pinkevich
 */
class Converter {

    companion object {
        fun convertFromDataModel(currentWeather: ServerResponse): CurrentWeather {
            return CurrentWeather(
                    "123",
                    currentWeather.location.name,
                    currentWeather.location.country,
                    currentWeather.current.temp_c.toInt(),
                    currentWeather.current.humidity,
                    WindConverter.convertToMetersPerSecond(currentWeather.current.wind_kph.toInt()),
                    WeatherIconConverter(currentWeather).weatherIconDrawable()
            )
        }
    }
}