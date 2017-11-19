package com.innopolis.outside.domain.converter

/**
 * @author Sergey Pinkevich
 */
class WindConverter {

    companion object {

        /**
         * Just converts from km/h -> m/s
         * @return casts result ro the Int: 4.7 -> 4
         */
        fun convertToMetersPerSecond(kilometersPerHour: Int) = kilometersPerHour * 1000 / 3600
    }
}