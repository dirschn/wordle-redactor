package com.example.wordleredaction

import org.junit.Assert.assertEquals
import org.junit.Test

class WordleRedactorTests {
    @Test
    fun redactText_3Lines() {
        val results =
            """
                first
                second
                third
            """.trimIndent()
        val expectedResults =
            """
                first
                second
                <redacted>
            """.trimIndent()
        val actualResults = redactText(results)
        assertEquals(expectedResults, actualResults)
    }

    @Test
    fun redactTest_2Lines() {
        val results =
            """
                first
                second
            """.trimIndent()
        val expectedResults =
            """
                first
                second
            """.trimIndent()
        val actualResults = redactText(results)
        assertEquals(expectedResults, actualResults)
    }
}