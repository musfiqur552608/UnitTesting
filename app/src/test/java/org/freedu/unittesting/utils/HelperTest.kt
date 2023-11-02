package org.freedu.unittesting.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    lateinit var helper:Helper
    @Before
    fun setUp(){
        helper = Helper()
    }

    @After
    fun tearDown(){
        println("After every test case")
    }

    @Test
    fun isPallindrome() {
        //Arrange

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