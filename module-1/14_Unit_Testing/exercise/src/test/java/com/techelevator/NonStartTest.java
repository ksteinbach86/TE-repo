package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class NonStartTest {
    @Test
    public void getPartialString_returns_the_correct_string_with_valid_input() {

        // Arrange
        String testStringA = "Hello";
        String testStringB = "There";
        NonStart nonStart = new NonStart();
        String expected = "ellohere";

        // Act
        String actual = nonStart.getPartialString(testStringA, testStringB);

        // Assert
        Assert.assertEquals(expected, actual);

    }



}
