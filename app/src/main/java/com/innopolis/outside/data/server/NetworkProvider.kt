package com.innopolis.outside.data.server

import com.innopolis.outside.common.network.NetworkError
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.domain.converter.Converter
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class NetworkProvider : DataProvider {

    var service: Service? = null

    @Inject constructor(service: Service?) {
        this.service = service
    }

    override fun getCurrentWeather(): Observable<CurrentWeather> {
        val subscription = service?.getCurrentWeather(object : Service.GetForecastCallback {
            override fun onSuccess(forecast: ServerResponse) {
                Converter.convertFromDataModel(forecast)
            }

            override fun onError(networkError: NetworkError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}