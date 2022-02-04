package com.techelevator;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class DateFashionTest {
    @Test
    public void getTable_returns_get_a_table() {

        // Arrange
        Integer testIntegerYou = 5;
        Integer testIntegerDate = 10;
        DateFashion fashion = new DateFashion();

        // Act
        int actual = fashion.getATable(testIntegerYou, testIntegerDate);

        // Assert
        Assert.assertEquals(2, actual);

    }



}
