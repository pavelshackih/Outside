package com.innopolis.outside.common.network

import com.innopolis.outside.data.server.ServerResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Sergey Pinkevich
 */
interface NetworkService {

    @GET("/v1/forecast.json")
    fun getForecast(@Query("q") city: String,
                    @Query("key") key: String): Observable<ServerResponse>
}