package com.innopolis.outside.screens.splash

import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.data.server.NetworkProvider
import com.innopolis.outside.screens.core.BasePresenter
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@Singleton
class SplashPresenter : BasePresenter<SplashView> {

    var view: SplashView? = null
    val networkService: Service?

    @Inject
    lateinit var provider: DataProvider

    @Inject constructor(service: Service) {
        this.networkService = service
    }

    fun getForecastList() {
        provider = NetworkProvider(networkService)
        val currentWeather = provider.getCurrentWeather()

    }

    override fun attachView(view: SplashView) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }
}