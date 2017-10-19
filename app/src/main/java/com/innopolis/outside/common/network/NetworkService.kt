package com.innopolis.outside.common.network

import com.innopolis.outside.data.server.ServerResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Sergey Pinkevich
 */
interface NetworkService {

    /**
     * Get current weather
     */
    @GET("/v1/current.json")
    fun getCurrentWeather(@Query("q") city: String,
                          @Query("key") key: String): Observable<ServerResponse>
}