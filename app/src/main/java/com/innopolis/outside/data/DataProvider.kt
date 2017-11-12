package com.innopolis.outside.data

import com.innopolis.outside.domain.model.CurrentWeather

/**
 * @author Sergey Pinkevich
 */
interface DataProvider {
    fun getCurrentWeather(): CurrentWeather?
}