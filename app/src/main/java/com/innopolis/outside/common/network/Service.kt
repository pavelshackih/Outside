package com.innopolis.outside.common.network

import com.innopolis.outside.domain.converter.Converter
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author Sergey Pinkevich
 */
class Service(val networkService: NetworkService) {

    fun getCurrentWeather(callback: GetWeatherCallback) = networkService.getCurrentWeather("Kazan", "5b6e26ac3383420e960130938171810")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map(
                    { t -> Converter.convertFromDataModel(t) }
            )
            .subscribe(
                    { s -> callback.onSuccess(s) },
                    { e -> callback.onError(NetworkError(e)) }
            )

    interface GetWeatherCallback {
        fun onSuccess(currentWeather: CurrentWeather)
        fun onError(networkError: NetworkError)
    }
}