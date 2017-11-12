package com.innopolis.outside.screens.main

import com.arellomobile.mvp.MvpView

/**
 * @author Sergey Pinkevich
 */
interface MainView : MvpView {

    fun showProgress()

    fun hideProgress()

    fun showLocation(location: String)

    fun showTemperature(temp: Int)

    fun showHumidity(humidity: Int)

    fun showWind(windSpeed: Int, windDegree: Int)
}