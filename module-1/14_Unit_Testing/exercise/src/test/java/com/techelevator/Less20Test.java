package com.techelevator;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Less20Test {
    @Test
    public void Integer_Less_Than_20() {

        // Arrange
        Integer testInteger = 18;
        Less20 test = new Less20();

        // Act
       boolean actual = test.isLessThanMultipleOf20(testInteger);
        // Assert
        Assert.assertEquals(true, actual);

    }
}

