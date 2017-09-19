package com.innopolis.outside.common

import java.text.DateFormat
import java.util.*

/**
 * @author Sergey Pinkevich
 */
fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM): String {
    val df = DateFormat.getDateInstance(dateFormat, Locale.getDefault())
    return df.format(this)
}