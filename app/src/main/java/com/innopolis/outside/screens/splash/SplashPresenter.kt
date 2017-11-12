package com.innopolis.outside.screens.splash

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.data.DataProvider
import com.innopolis.outside.data.server.NetworkProvider
import com.innopolis.outside.screens.core.BasePresenter
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class SplashPresenter : MvpPresenter<SplashView> {

    private val networkService: Service?

    @Inject
    lateinit var provider: DataProvider

    @Inject constructor(service: Service) {
        this.networkService = service
    }

    fun getForecastList() {
        provider = NetworkProvider(networkService)
        viewState.startMainScreen(provider.getCurrentWeather()!!)
    }
}