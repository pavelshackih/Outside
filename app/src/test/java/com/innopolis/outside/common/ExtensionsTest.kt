package com.innopolis.outside.common

import org.junit.Test
import java.util.*
import kotlin.test.assertTrue

/**
 * @author Sergey Pinkevich
 */
class ExtensionsTest {

    @Test
    fun testStringToDate() {
        val date = "2017-11-19 22:00"
        val actual = date.getDate()
        val expected = Date(2017, 11, 19, 22, 0)
        assertTrue { actual.equals(expected) }
    }
}