package com.innopolis.outside.domain.model

import android.os.Parcel
import android.os.Parcelable
import com.innopolis.outside.common.createParcel

/**
 * @author Sergey Pinkevich
 */
data class CurrentWeather(val date: String,
                          val city: String,
                          val country: String,
                          val currentTemperature: Int,
                          val humidity: Int,
                          val windSpeed: Int,
                          val weatherIcon: Int): Parcelable {
    companion object {
        @JvmField @Suppress("unused")
        val CREATOR = createParcel { CurrentWeather(it) }
    }

    protected constructor(parcelIn: Parcel) : this(
            parcelIn.readString(),
            parcelIn.readString(),
            parcelIn.readString(),
            parcelIn.readInt(),
            parcelIn.readInt(),
            parcelIn.readInt(),
            parcelIn.readInt()
    )

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(date)
        dest.writeString(city)
        dest.writeString(country)
        dest.writeInt(currentTemperature)
        dest.writeInt(humidity)
        dest.writeInt(windSpeed)
        dest.writeInt(weatherIcon)
    }

    override fun describeContents() = 0
}