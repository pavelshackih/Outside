package com.innopolis.outside.data.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * @author Sergey Pinkevich
 */
@Entity
data class CurrentWeather(
        val date: String = "",
        val city: String = "",
        val country: String = "",
        val currentTemperature: Int,
        val humidity: Int,
        val windSpeed: Int,
        val weatherIcon: Int
) {
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0
}