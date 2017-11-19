package com.innopolis.outside.common

import android.os.Parcel
import android.os.Parcelable
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Sergey Pinkevich
 */
fun String.getDate(dateFormat: Int = DateFormat.MEDIUM): String {
    val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH)
    return formatter.format(this)
}

inline fun <reified T : Parcelable> createParcel(
        crossinline createFromParcel: (Parcel) -> T?): Parcelable.Creator<T> =
        object : Parcelable.Creator<T> {
            override fun createFromParcel(source: Parcel): T? = createFromParcel(source)
            override fun newArray(size: Int): Array<out T?> = arrayOfNulls(size)
        }