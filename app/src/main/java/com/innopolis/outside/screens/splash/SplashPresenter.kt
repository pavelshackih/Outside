package com.innopolis.outside.screens.splash

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.common.network.NetworkError
import com.innopolis.outside.common.network.Service
import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
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
        networkService?.getCurrentWeather(object : Service.GetWeatherCallback {
            override fun onSuccess(currentWeather: CurrentWeather) {
                viewState.startMainScreen(currentWeather)
            }

            override fun onError(networkError: NetworkError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}