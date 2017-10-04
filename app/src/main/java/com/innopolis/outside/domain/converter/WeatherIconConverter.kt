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

    private fun checkDayOrNight(): TimeOfDay {
        val time = Date(response.dt).hours
        return if (time in 6..20) {
            TimeOfDay.DAY
        } else {
            TimeOfDay.NIGHT
        }
    }
}