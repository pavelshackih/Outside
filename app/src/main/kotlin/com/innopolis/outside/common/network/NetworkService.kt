package com.innopolis.outside.common.network

import com.innopolis.outside.data.server.ServerResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Sergey Pinkevich
 */
interface NetworkService {

    @GET("/data/2.5/forecast/")
    fun getForecastList(@Query("q") city: String,
                        @Query("APPID") key: String,
                        @Query("units") units: String): Observable<ServerResponse>
}