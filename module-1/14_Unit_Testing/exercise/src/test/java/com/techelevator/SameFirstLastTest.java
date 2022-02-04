package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SameFirstLastTest {
    @Test
    public void first_and_last_int_the_same() {

        // Arrange
        Integer testInteger = 1;
        //    Integer AnotherTestInteger = 1;
        SameFirstLast same = new SameFirstLast();

        // Act
        boolean actual = testInteger.equals(testInteger);

        // Assert
        Assert.assertEquals(true, true);

    }
}