package com.innopolis.outside.data

import com.innopolis.outside.domain.model.CurrentWeather
import io.reactivex.Observable

/**
 * @author Sergey Pinkevich
 */
interface DataProvider {
    fun getCurrentWeather(): Observable<CurrentWeather>
}