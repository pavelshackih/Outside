package com.innopolis.outside.model.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * @author Sergey Pinkevich
 */
class City {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("coord")
    @Expose
    var coord: Coord? = null

    @SerializedName("country")
    @Expose
    var country: String? = null
}