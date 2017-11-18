package com.innopolis.outside.screens.main

import com.arellomobile.mvp.MvpView

/**
 * @author Sergey Pinkevich
 */
interface MainView : MvpView {

    fun showLocation(city: String, country: String)

    fun showTemperature(temp: Int)

    fun showHumidity(humidity: Int)

    fun showWind(windSpeed: Int, windDegree: Int)
}