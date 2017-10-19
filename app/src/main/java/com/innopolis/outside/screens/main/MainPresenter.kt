package com.innopolis.outside.screens.main

import com.innopolis.outside.common.network.NetworkError
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.ForecastDataMapper
import com.innopolis.outside.screens.core.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class MainPresenter : BasePresenter<MainView> {

    var view: MainView? = null
    var disposable: CompositeDisposable? = null
    var service: Service? = null

    @Inject constructor(service: Service) {
        this.service = service
    }

    fun getForecastList() {
        view?.showProgress()
        val subscription = service?.getCurrentWeather(object : Service.GetForecastCallback {
            override fun onSuccess(forecast: ServerResponse) {
                val mapper = ForecastDataMapper()
                val currentWeather = mapper.convertFromDataModel(forecast)
                view?.showLocation("${currentWeather.city}, ${currentWeather.country}")
                view?.showTemperature(currentWeather.currentTemperature)
                view?.showHumidity(currentWeather.humidity)
                view?.showWind(currentWeather.windSpeed, currentWeather.windSpeed)
                view?.hideProgress()
            }

            override fun onError(networkError: NetworkError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        disposable?.add(subscription!!)
    }

    override fun attachView(view: MainView) {
        this.view = view
        disposable = CompositeDisposable()
    }

    override fun detachView() {
        view = null
        disposable?.clear()
    }
}