package com.innopolis.outside.screens.splash

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.common.network.Service
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class SplashPresenter : MvpPresenter<SplashView> {

    private val networkService: Service?

    @Inject constructor(service: Service) {
        this.networkService = service
    }

    fun getForecastList() {
    }
}