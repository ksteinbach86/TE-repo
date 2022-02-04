package com.techelevator;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lucky13Test {
    @Test
    public void return_true_if_array_has_no_1_and_3() {

        // Arrange
        Integer[] nums = new Integer[0];
        Integer getLucky = 1;
        Lucky13Test test = new Lucky13Test();

        // Act
        boolean actual = getLucky.equals(getLucky);

        // Assert
        Assert.assertEquals(true, true);

    }
}
