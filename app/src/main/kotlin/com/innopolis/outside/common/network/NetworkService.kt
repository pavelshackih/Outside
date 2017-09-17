package com.innopolis.outside.common.network

import com.innopolis.outside.model.entity.Response
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * @author Sergey Pinkevich
 */
interface NetworkService {
    /**
     * Погода в данный момент
     */
    @GET("/data/2.5/forecast")
    fun getForecastNow(): Observable<Response>
}