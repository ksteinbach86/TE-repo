package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class WordCountTest {
    @Test
    public void getCount_for_a_String() {

        // Arrange
        String testString = "";
        String test = new String();

        // Act
        String actual = (testString);

        // Assert
        Assert.assertEquals("", actual);

    }




}
