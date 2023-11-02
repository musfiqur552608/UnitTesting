package org.freedu.unittesting.utils

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPallindrome() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false, result)
    }
    fun isPallindrome_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(false, result)
    }
}