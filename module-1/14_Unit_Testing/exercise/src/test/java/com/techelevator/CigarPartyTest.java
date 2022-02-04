package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CigarPartyTest {

    @Test
    public void getParty_returns_weekend_and_cigars_39() {

        // Arrange
        Boolean testBoolean = false;
        int testInteger = 39;
        CigarParty party = new CigarParty();

        // Act
       boolean actual = party.haveParty(testInteger, testBoolean);

        // Assert
        Assert.assertEquals(false, actual);

    }


//    String theString = "Hello World!"; // Arrange
//    boolean startsWithHello = theString.startsWith("Hello"); // Act

//    @Test
//    public void getLowerEdge_returns_the_right_bits_for_valid_string() {
//
//        // Arrange
//        String testString = "Hello";
//        StringBits bits = new StringBits();
//
//        // Act
//        String actual = bits.getBits(testString);
//
//        // Assert
//        Assert.assertEquals("Hlo", actual);
//
//    }


}
