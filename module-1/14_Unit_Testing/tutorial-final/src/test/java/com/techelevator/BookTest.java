package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookTest {

    Book book;

    @Before
    public void Setup()  {
        this.book = new Book("Shadowfox", "Ben Langhinrichs", 25.00);

    }

    @Test
    public void constructor_should_set_properties() {
        // Arrange - since we are testing a constructor, there's really nothing to setup

        // Act - call the constructor by creating a new object with valid parameters
        //Book book = new Book("Shadowfox", "Ben Langhinrichs", 25.00);

        // Assert - verify the properties are set appropriately

        Assert.assertEquals("Shadowfox", this.book.getTitle());
        Assert.assertEquals("Ben Langhinrichs", this.book.getAuthor());
        Assert.assertEquals(25.00, this.book.getPrice(), 0.001);

    }

    @Test
    public void toString_should_return_correct_string() {
        // Arrange - since we are testing a constructor, there's really nothing to setup

        // Act - call the constructor by creating a new object with valid parameters
        //Book book = new Book("Shadowfox", "Ben Langhinrichs", 25.00);

        // Assert - verify the properties are set appropriately
        //System.out.println(book);

        Assert.assertEquals("Book: 'Shadowfox' by Ben Langhinrichs, Price: $25.00", this.book.toString());
    }

    // Arrange

    // Act

    // Assert


}
