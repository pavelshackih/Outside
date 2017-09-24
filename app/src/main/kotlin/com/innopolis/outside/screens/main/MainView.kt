package com.innopolis.outside.screens.main

import com.innopolis.outside.screens.core.BaseView

/**
 * @author Sergey Pinkevich
 */
interface MainView : BaseView {
    fun showProgress()
    fun hideProgress()
    fun showLocation(location: String)
    fun showTemperature(temp: Int)
    fun showHumidity(humidity: Int)
    fun showWind(windSpeed: Int, windDegree: Int)
}