package com.innopolis.outside.common.network

import com.innopolis.outside.model.entity.Response
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author Sergey Pinkevich
 */
class Service(val networkService: NetworkService) {

    fun getForecastNow(callback: GetForecastNowCallback) = networkService.getForecastNow()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    { t -> callback.onSuccess(t) },
                    { e -> callback.onError(NetworkError(e)) }
            )

    interface GetForecastNowCallback {
        fun onSuccess(forecast: Response)
        fun onError(networkError: NetworkError)
    }
}