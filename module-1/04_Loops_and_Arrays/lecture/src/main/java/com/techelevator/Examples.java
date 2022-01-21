package com.techelevator;

public class Examples {

	public static void main(String[] args) {
		int x;
		int y;

//		System.out.println("*******************************************");
//		System.out.println("**** INCREMENT AND DECREMENT OPERATORS ****");
//		System.out.println("*******************************************");
//		System.out.println();

		/* The ++ operator increments a variable by 1 (i.e. adds one to the
		 * value of the variable and assigns the result to the variable) */

		/* The -- operator decrements a variable by 1 (i.e. subtracts one from the
		 * value of the variable and assigns the result to the variable) */

		// when the ++ is used as a postfix operator the increment is performed after evalutation

		// when the ++ is used as a prefix operator the increment is performed before evalutation

//		System.out.println("****************************************");
//		System.out.println("**** SHORTHAND ASSIGNMENT OPERATORS ****");
//		System.out.println("****************************************");
//		System.out.println();

		/* The "shorthand operators" are ( += -= *= ).  They have the
		 * effect of applying the arithmetic operator on the variable
		 * on the left and the expression on the right and then assigning
		 * the result to the variable on the left.
		 *
		 * So, this:
		 *
		 *     x = x + 2;
		 *
		 * Is equivalent to this:
		 *
		 *     x += 2;
		 */

		// the right hand side of the operator can be an expression

//		System.out.println("*******************");
//		System.out.println("**** FOR LOOPS ****");
//		System.out.println("*******************");
//		System.out.println();


		// Print whether each number between 1 and 10 (inclusive) is even or odd
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}

		}


		// loops can be nested

//		System.out.println("****************");
//		System.out.println("**** ARRAYS ****");
//		System.out.println("****************");
//		System.out.println();


		int [] myArray = new int[20];
		myArray [0] = 1;
		myArray [1] = 5;
		// myArray [20] = 20;
		System.out.println("Last element is " + myArray[myArray.length-1]);




		// the following line declares an array of Strings with 4 elements

		// the following array has length 3 even when no values have been assigned.

		int [] myArrayOf3 = new int [3];
		System.out.println("Element has value before being assigned " + myArrayOf3[2]);

		for (int i = 0; i < myArrayOf3.length; i++) {
			myArrayOf3[i] = i*2;
		}
		System.out.println("array[1] = "+ myArrayOf3[1]);

		boolean[] myBooleans = new boolean[10];
		System.out.println(myBooleans[0]);

		String[] strings = new String[5];
		String[] strings2 = new Strings [] {"a", "b", "c"};
		String[] strings3 = new Strings [] {"a", "b", "c"};


		// The same literal syntax would apply to an array of Strings

		/* Arrays are Objects, so they are "passed by reference".  In other words. when assigning
		 * the value of one array variable to another array variable, we are assigning a reference
		 * to the same array to both */



	}

}
