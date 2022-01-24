package com.techelevator;




public class Lecture {


	public static void main(String[] args) {

		String myName = new String( "Ben");
		House myHouse = new House();
		//myHouse.setBedrooms(3);
		//myHouse.bedrooms = 20000;
		//myHouse.setFullBathrooms(1);
		//myHouse.setHalfBathooms(1);
		//myHouse.fullBathrooms = 1;
		//myHouse.halfBathrooms = 1;
		System.out.println("My Bedrooms="+myHouse.getBedrooms());
		System.out.println("My Bathrooms="+myHouse.getBathrooms());


		House yourHouse = new House(2,1,0,"Red paint");

		System.out.println("Your Bedrooms="+yourHouse.getBedrooms());
		System.out.println("Your Bathrooms="+yourHouse.getBathrooms());
		if (yourHouse.buildAddition(1,1,0)) {
			System.out.println("New addition built");
			System.out.println("Your Bedrooms="+yourHouse.getBedrooms());
			System.out.println("Your Bathrooms="+yourHouse.getBathrooms());
		}



//		int[] myNums = new int[] {1, 2, 3, 4, 5};
//		int[] yourNums = new int[] {1, 2, 3, 4, 5};
//		myNums[0] = 10;
//		for (int i = 0; i < myNums.length; i++) {
//			System.out.println(yourNums[i]);
//		}
//
//		String str1 = "MyString";
//		String str2 = "YourString";
//		if (str1.equals(str2)) {
//			System.out.println("Equal");
//		}

		String fullName = "Ben Langhinrichs";
		String fullName2 = fullName;
		System.out.println("Length of '"+fullName+"' is "+fullName.length());
		System.out.println("Last name is "+ fullName.substring(4));
		System.out.println("First part of Last name is "+ fullName.substring(4, 8));
		System.out.println("Last name is "+ fullName.substring(fullName.indexOf(" ")+1));
		//System.out.println("Decimal places of 3.1415 "+ "3.1415".substring("3.1415".indexOf(".")+1));
		fullName = "Jan";
		//fullName2 = "Jan";
		//System.out.println("Last four characters of Last name is "+ fullName.substring(fullName.length()-4));
		System.out.println(fullName + " != " + fullName2);

		if (fullName2.contains("Lang")) {
			System.out.println("Contains Lang");
		}
		String[] names = fullName2.split(" ");
		System.out.println("names[0]="+names[0]);
		System.out.println(names[1]+", "+ names[0]);
		System.out.println(fullName2.join(","));
		//fullName = fullName2.replace("lang", "B");
		fullName = fullName2.toUpperCase();
		System.out.println(fullName);
		fullName = "Reggie Ronald";
		fullName2 = "   reggie ";
		if (fullName2.toUpperCase().contains("REGGIE")) {
			System.out.println("Contains Reggie");
		}
		if (fullName.startsWith("Ben")) {
			System.out.println("Yay!");
		}
		if (fullName.endsWith("Ronald")) {
			System.out.println("Boo!");
		}


		// Loops

		int[] nums = {1, 15, 25};
		int j;
		//int i;
		for (int i = 0; i < nums.length; i++) {
			// stuff
			System.out.println("Element at index "+i+" is "+nums[i]);
		}

		for (int n = nums.length-1; n >= 0; n--) {
			System.out.println("Element at index "+n+" is "+nums[n]);
		}

		String answer  = "";
		while (!answer.equals("YES")) {
			// stuff
			// Ask for input
		}

		do {
			// stuff
			// Ask for input

		} while (!answer.equals("YES"));


		TownHouse myTownHouse = new TownHouse();
		System.out.println(myTownHouse.getBathrooms());



//		System.out.println("************************************");
//		System.out.println("****** MAKING A STRING OBJECT ******");
//		System.out.println("************************************");
//
//		/* The String class gets special treatment in the Java language.  One
//		 * example of this is that there is a literal representation of a
//		 * String (i.e. characters appearing between two double quotes.  This
//		 * is not the case for most classes */
//
//		/* create an new instance of String using a literal */
//
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

	}
}
