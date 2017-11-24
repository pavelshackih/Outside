package com.innopolis.outside.data

import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.Single

/**
 * @author Sergey Pinkevich
 */
interface DataProvider {
    fun getCurrentWeather(): Single<CurrentWeather>
}