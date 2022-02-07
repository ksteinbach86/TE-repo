package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MaxEnd3Test {
    @Test
    public void first_and_last_elements_in_array() {


        int[] firstOutput = new int[]{1, 2, 3};
        int[] finalOutput = new int[]{3, 3, 3};


        int[] actual = things.makeArray(firstOutput);

        Assert.assertArrayEquals(finalOutput, actual);
    }


}
