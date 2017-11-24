package com.innopolis.outside.data.server

import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class NetworkProvider @Inject constructor(var service: Service) : DataProvider {

    override fun getCurrentWeather(): Single<CurrentWeather> = service.getForecast()
}