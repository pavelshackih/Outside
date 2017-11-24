package com.innopolis.outside.common.network

import com.innopolis.outside.common.APP_ID
import com.innopolis.outside.domain.converter.Converter
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.Single

/**
 * @author Sergey Pinkevich
 */
class Service(private val networkService: NetworkService) {

    fun getForecast(): Single<CurrentWeather> =
            networkService.getForecast("Moscow", APP_ID)
                    .map({ Converter.convertFromDataModel(it) })
                    .firstOrError()
}