package com.innopolis.outside.screens.main

import com.innopolis.outside.common.network.NetworkError
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.server.ServerResponse
import com.innopolis.outside.domain.model.Forecast
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
        val subscription = service?.getForecast(object : Service.GetForecastCallback {
            override fun onSuccess(forecast: ServerResponse) {
                val mapper = ForecastDataMapper()
                print(1)
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