package com.innopolis.outside.model.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * @author Sergey Pinkevich
 */
class ForecastResponse {
    @SerializedName("cod")
    @Expose
    var cod: String? = null

    /**
     * Count of forecasts
     * There are forecasts each 3 hours during 5 days
     * The maximum amount of forecasts is 40
     */
    @SerializedName("cnt")
    @Expose
    var cnt: Int? = null

    /**
     * List of forecasts
     */
    @SerializedName("list")
    @Expose
    var list: List<ForecastList>? = null

    @SerializedName("city")
    @Expose
    var city: City? = null
}