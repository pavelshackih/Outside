package com.innopolis.outside.domain.converter

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * @author Sergey Pinkevich
 */

class WindConverterTest {

    @Test
    fun convertToKilometersPerHour() {
        val kilometersPerHour = 20
        val actual = WindConverter.convertToMetersPerSecond(kilometersPerHour)
        assertEquals(actual, 5)
    }
}