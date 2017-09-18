package com.innopolis.outside.common.network

import com.innopolis.outside.data.server.ServerResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author Sergey Pinkevich
 */
class Service(val networkService: NetworkService) {

    fun getForecast(callback: GetForecastCallback) = networkService.getForecastList("Moscow", "60947ea90bd50c478628a9214507ef87", "metrics")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    { t -> callback.onSuccess(t) },
                    { e -> callback.onError(NetworkError(e)) }
            )

    interface GetForecastCallback {
        fun onSuccess(forecast: ServerResponse)
        fun onError(networkError: NetworkError)
    }
}