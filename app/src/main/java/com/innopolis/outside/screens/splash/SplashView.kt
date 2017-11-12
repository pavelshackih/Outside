package com.innopolis.outside.screens.splash

import com.arellomobile.mvp.MvpView
import com.innopolis.outside.domain.model.CurrentWeather

/**
 * @author Sergey Pinkevich
 */
interface SplashView : MvpView {
    fun startMainScreen(currentWeather: CurrentWeather)
}