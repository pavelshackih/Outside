package com.innopolis.outside.model.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * @author Sergey Pinkevich
 */
class Clouds {
    /**
     * Cloudiness in %
     */
    @SerializedName("all")
    @Expose
    var all: Int? = null
}