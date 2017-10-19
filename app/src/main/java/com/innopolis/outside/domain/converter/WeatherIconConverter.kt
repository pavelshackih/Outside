package com.innopolis.outside.domain.model

import com.innopolis.outside.R
import com.innopolis.outside.data.server.ServerResponse
import java.util.*

/**
 * @author Sergey Pinkevich
 */
class WeatherIconConverter(private val response: ServerResponse) {

    fun weatherIconDrawable(): Int {
        return R.drawable.clear_day
    }
}