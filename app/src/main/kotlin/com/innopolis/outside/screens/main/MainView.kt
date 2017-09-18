package com.innopolis.outside.screens.main

import com.innopolis.outside.screens.core.BaseView

/**
 * @author Sergey Pinkevich
 */
interface MainView : BaseView {
    fun showLocation(city: String, country: String)
    fun showTemperature(temp: Int)
    fun showHumidity(humidity: Int)
    fun showWind(wind: Int)
}