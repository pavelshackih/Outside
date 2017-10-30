package com.innopolis.outside.data.server

import com.innopolis.outside.common.network.NetworkError
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
class NetworkProvider : DataProvider {

    var service: Service? = null
    var disposal: CompositeDisposable? = null

    @Inject constructor(service: Service?) {
        this.service = service
        disposal = CompositeDisposable()
    }

    override fun getCurrentWeather(): CurrentWeather? {
        var weather: CurrentWeather? = null
        val subscription = service?.getCurrentWeather(object : Service.GetWeatherCallback {
            override fun onSuccess(currentWeather: CurrentWeather) {
                weather = currentWeather
            }

            override fun onError(networkError: NetworkError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        disposal?.add(subscription!!)
        return weather
    }
}