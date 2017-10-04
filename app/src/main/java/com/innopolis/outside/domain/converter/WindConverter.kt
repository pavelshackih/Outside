package com.innopolis.outside.domain.converter

import android.app.Activity
import com.innopolis.outside.R

/**
 * @author Sergey Pinkevich
 */
class WindConverter {

    companion object {

        fun convertToKilometerPerHour(metersPerSeconds: Int) = metersPerSeconds * 1000 / 3600

        /**
         * Convert the degree to the string equivalent
         * For example, 0° -> north, 52° -> northeast
         * @return necessary string resource
         */
        fun convertFromWindDegree(activity: Activity, degree: Int): String {
            val sideWorldsList = activity.resources.getStringArray(R.array.worldsides)
            val changedDegree = degree + 22.5
            return sideWorldsList[(changedDegree / 8).toInt()]
        }
    }
}