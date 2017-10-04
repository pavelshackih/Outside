package com.innopolis.outside.domain.converter

import org.junit.Assert.*
import org.junit.Test

/**
 * @author Sergey Pinkevich
 */

class WindConverterTest {

    @Test
    fun convertToKilometerPerHour() {
        val metersPerSecond = 5
        val actual = WindConverter.convertToKilometerPerHour(metersPerSecond)
    }
}