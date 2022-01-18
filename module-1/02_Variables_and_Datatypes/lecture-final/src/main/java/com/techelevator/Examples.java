package com.techelevator;

public class Examples {

	public static void main(String[] args) {
		
		// Variable declaration
		int x;
		
		// Assignment statement
		x = 3;
		
		// We can also declare and assign in one statement
		int y = 5;
		System.out.println(y);

		// camelCase
		// PascalCase
		// snake_case
		// kebab-case


		double timeOfDay = 45.7;
		System.out.println(timeOfDay);
		
		// variable names should start with a lower case letter and use camelCase
		int ageOfAdulthood = 18;
		
		// literal values of type char appear between single quotes
		char theFirstLetter = 'a';
		
		// use floating point types like double to represent decimal values
		double averageNumberOfChildren = 2.5;
		System.out.println(averageNumberOfChildren);

		boolean isPrintable = true;
		
		// three different types of assignment statements
		// 1) assigning a literal
		x = 2;
		// 2) assigning from another variable
		y = x;
		x = 3;
		System.out.println(x);
		System.out.println(y);



		// 3) assigning the result of an expression
		y = x + 3;
		System.out.println(y);
		
		// ******************
		// LITERALS
		// ******************
		int myInt = 123;
		byte myByte = 3;
		//myByte = myInt;  // causes a compiler error because the int variable is capable of holding values that won't fit in a byte
		myInt = myByte;
		
		// Hexadecimal literals are preceded by 0x
		int twentySeven = 0x1B;
		System.out.println(twentySeven);

		// Base 10: digits 0123456789
		// Base 16: digits 0123456789ABCDEF

		int mySpecialInt = 5;
		String mySpecialString = "Ben is our Java instructor";
		System.out.println(mySpecialString);

		double myFriendsAge = 22.5;
		int myAge = 50;
		double combinedAge = myAge + myFriendsAge;
		System.out.println("My friend is " + myFriendsAge);
		System.out.println("Our combined age is " + (myFriendsAge + myAge));
		
		// String literals appear between double quotes
		String firstName = "John";
		String lastName = "Doe";
		// the + operator is used for String concatenation
		String fullName = firstName + " " + lastName;
		//System.out.println("first name: "+firstName);
		//System.out.println("last name: "+lastName);
		//System.out.println("full name: "+fullName);
		
		int numberOfNETStudents = 8;
		int numberOfJavaStudents = 14;
		int totalNumberOfStudents = numberOfNETStudents + numberOfJavaStudents;
		//System.out.println("totalNumberOfStudents is equal to: "+totalNumberOfStudents);
		
		// **********************
		// TRUNCATION AND CASTING
		// **********************
		
		int cookiesEaten = 10;
		int numberOfChildrenEatingCookies = 6;
		float averageCookiesEaten = cookiesEaten / numberOfChildrenEatingCookies; // the right hand side of this operation is evaluated as an int, so the fractional value is truncated
		System.out.println("Average Cookies Eaten: "+averageCookiesEaten);

		// 5 / 2 if both are doubles, will be 2.5. If both are ints, it will be 2

		int myResult = 5 / 2;
		int myRemainder = 5 % 2;


		
		averageCookiesEaten = (float)cookiesEaten / numberOfChildrenEatingCookies; // here we "cast" an int variable to type float so that the result of the arithmetic operation is a float
		//System.out.println("(casting to float) Average Cookies Eaten: "+averageCookiesEaten);
		
		double aDouble = 7.89;
		//int anInteger = aDouble;  // this is a compiler error
		int anInteger = (int)aDouble;  // this will truncate the fractional part of the double
		//System.out.println(aDouble+" cast to an int is equal to: "+anInteger);
		
		
		// **********************
		// ARITHMETIC OPERATORS
		// **********************
		int a = 12;
		//S//ystem.out.println("What happens to b?");
		int b = a + 3;  // ADDITION
		//System.out.println(b);
		b = a - 5;  // SUBTRACTION
		//System.out.println(b);
		b = a * 2;  // MULTIPLICATION
		//System.out.println(b);
		b = a / 2;  // DIVISION
		//System.out.println(b);
		
		// Modulus division
		int remainder = 10 % 3;
		//System.out.println("The remainder of dividing 10 by 3 is "+remainder);
		
		remainder = 8 % 4;
		//System.out.println("The remainder of dividing 8 by 4 is "+remainder);
		
		// ***********************
		// ESCAPE CHARACTERS
		// ***********************
		String emerilQuote = "Emeril said, \"Bam!\"";
		System.out.println(emerilQuote);
		
		//System.out.println("To print \\ I need two backslashes");
		
		//System.out.println("Hello!\n\nGoodbye!");  // The escape character for newline is \n
		
		//System.out.println("Hello\tGoodbye"); // The escape character for tab is \t
	}

}