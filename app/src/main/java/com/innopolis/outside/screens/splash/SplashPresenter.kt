package com.innopolis.outside.screens.splash

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.common.RxScheduler
import com.innopolis.outside.common.network.Service
import javax.inject.Inject

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class SplashPresenter @Inject constructor(val service: Service, private val schedulers: RxScheduler) : MvpPresenter<SplashView>() {

    fun getForecastList() {
        service.getForecast()
                .subscribeOn(schedulers.getNetwork())
                .observeOn(schedulers.getMain())
                .subscribe { data, exception ->
                    if (exception != null) {
                        Log.e("SplashPresenter", exception.message, exception)
                    } else {
                        viewState.startMainScreen(data)
                    }
                }
    }
}