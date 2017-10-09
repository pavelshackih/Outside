package com.innopolis.outside.domain.converter

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * @author Sergey Pinkevich
 */

class WindConverterTest {

    @Test
    fun convertToKilometersPerHour() {
        val metersPerSecond = 15
        val actual = WindConverter.convertToKilometersPerHour(metersPerSecond)
        assertEquals(actual, 4)
    }
}