package com.innopolis.outside.screens.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.innopolis.outside.domain.model.CurrentWeather

/**
 * @author Sergey Pinkevich
 */
@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun showCurrentWeather(currentWeather: CurrentWeather) {
        viewState.showHumidity(currentWeather.humidity)
        viewState.showLocation(currentWeather.city, currentWeather.country)
        viewState.showTemperature(currentWeather.currentTemperature)
        viewState.showWind(currentWeather.windSpeed, 123)
    }
}