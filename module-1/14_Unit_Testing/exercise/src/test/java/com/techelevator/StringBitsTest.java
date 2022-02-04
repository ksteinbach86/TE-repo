package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTest {

    @Test
    public void getBits_returns_the_right_bits_for_valid_string() {

        // Arrange
        String testString = "Hello";
        StringBits bits = new StringBits();

        // Act
        String actual = bits.getBits(testString);

        // Assert
        Assert.assertEquals("Hlo", actual);

    }

//    @Test
//    public void getBits_returns_empty_string_for_null_input() {
//
//        // Arrange
//        String testString = null;
//        StringBits bits = new StringBits();
//
//        // Act
//        String actual = bits.getBits(testString);
//
//        // Assert
//        Assert.assertEquals("", actual);
//
//    }

}
