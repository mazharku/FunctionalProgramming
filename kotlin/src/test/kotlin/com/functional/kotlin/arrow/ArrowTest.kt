package com.functional.kotlin.arrow

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArrowTest {

    @Test
    fun divideShouldReturnResultForValidInput() {
        val result = divide(4, 2);
        val expected = 2;
        Assertions.assertEquals(expected, result.let { it.orNull() });
    }

    @Test
    fun diveShouldReturnErrorMessageWhenInvalidInput() {
        val result = divide(4, 0);
        Assertions.assertTrue(result.isLeft())
    }
}