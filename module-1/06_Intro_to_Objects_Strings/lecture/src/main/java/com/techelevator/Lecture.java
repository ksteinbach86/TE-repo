package com.techelevator;




public class Lecture {

	public static void main(String[] args) {

		String myName = "Kevin:";
		House myHouse = new House();
		myHouse.bedrooms = 3;
		myHouse.fullBathrooms = 1;
		myHouse.halfBathrooms = 1;
		House yourHouse = myHouse;

		System.out.println("Bedrooms =" + yourHouse.bedrooms);

		int[] myNums = new int[]{1, 2, 3, 4, 5};
		int[] yourNums = myNums;
		myNums[0] = 10;
		for (int i = 0; i < myNums.length; i++) ;
//		System.out.println(yourNums[i]);

	}

		String str1 = "MyString";
		String str2 = "YourString";





}

//		System.out.println("************************************");
//		System.out.println("****** MAKING A STRING OBJECT ******");
//		System.out.println("************************************");
//
//		/* The String class gets special treatment in the Java language.  One
//		 * example of this is that there is a literal representation of a
//		 * String (i.e. characters appearing between two double quotes.  This
//		 * is not the case for most classes */
//
//		/* create a new instance of String using a literal */


		// ^^^^^^^    ^^^^^^^
		// Look at Lecture-final



//
//		System.out.println();
//		System.out.println("******************************");
//		System.out.println("****** MEMBER METHODS ******");
//		System.out.println("******************************");
//		System.out.println();
//
//
//		/* Other commonly used methods:
//		 *
//		 * endsWith
//		 * startsWith
//		 * indexOf
//		 * lastIndexOf
//		 * length
//		 * substring
//		 * toLowerCase
//		 * toUpperCase
//		 * trim
//		 */
//
//		System.out.println();
//		System.out.println("**********************");
//		System.out.println("****** EQUALITY ******");
//		System.out.println("**********************");
//		System.out.println();
//
//        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
//        String hello1 = new String(helloArray);
//        String hello2 = new String(helloArray);
//
//		/* Double equals will compare to see if the two variables, hello1 and
//		 * hello2 point to the same object in memory. Are they the same object? */
//		if (hello1 == hello2) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//		String hello3 = hello1;
//		if (hello1 == hello3) {
//			System.out.println("hello1 is the same reference as hello3");
//		}
//
//		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
//		if (hello1.equals(hello2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println(hello1 + " is not equal to " + hello2);
//		}
//
//	}
//}
