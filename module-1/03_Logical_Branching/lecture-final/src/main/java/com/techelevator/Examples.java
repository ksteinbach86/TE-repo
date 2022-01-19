package com.techelevator;

public class Examples {

	public static void main(String[] args) {

		// declaration statement for a variable named "result" of type boolean
		boolean result = false;

		// Boolean expressions



		System.out.println("****************************");
		System.out.println("*** COMPARISON OPERATORS ***");
		System.out.println("****************************");
		System.out.println();
		/*
		 ==  Equal to
		 !=  Not equal to
		*/
		int a = 4;
		int b = 5;
		String str1 = "a";
		String str2 = "a";

		result = ( 2 == 2 );
		System.out.println(result);
		result = ( 2 != 2 );
		System.out.println(result);
		result = ( a == b );
		System.out.println(result);
		result = ( 'a' == 'a' );
		System.out.println(result);
		result = ( "a" == "a");
		System.out.println(result);
		result = ( str1 == str2 );
		System.out.println(result);

		/*
		 >  Greater than
		 <  Less than
		 >= Greater than or equal to
		 <= Less than or equal to
		*/

		result = ( 3 > 2);
		System.out.println("result = ( 3 > 2) --> "+result);

		a = 4;
		b = 4;
		result = (a > b);
		System.out.println(result);
		result = (a >= b );
		int jack = 19;
		result = (jack >= 13) && (jack <= 19);

		System.out.println("*************************");
		System.out.println("*** LOGICAL OPERATORS ***");
		System.out.println("*************************");
		System.out.println();
		/*
		 &&  AND
		 ||  OR
		 !  NOT
		 ^  XOR  (exclusive OR)
		 */

		result = ( true || false );
		result = ( false || false );
		result = ( true || false || true );

		result = !false;
		result = ( true || false );
		result = !( true || false );
		System.out.println(result);
		result = (!(jack >= 13)) && (jack <= 19);
		result = ((jack > 13 || jack < 19) && (jack /  2 < 10));
		result = true || false;



		System.out.println(result);
		//result = ( jack + 10 > 15);
		//result = ( jack + false );

		System.out.println("***************************");
		System.out.println("*** BOOLEAN EXPRESSIONS ***");
		System.out.println("***************************");
		System.out.println();

		// String comparison
		result = str1.equals(str2);
		str1 = "Ben";
		str2 = "BEN";
		result = str1 == str2;
		System.out.println(str1 + " and " + str2 + " result=" + result);
		result = str1.equals(str2);
		System.out.println(str1 + " and " + str2 + " result=" + result);
		result = str1.equalsIgnoreCase(str2);
		System.out.println(str1 + " and " + str2 + " result=" + result);

		int myFriendsAge = 16;
		result = ( myFriendsAge >= 21 ) || (str1.equals(str2)) || a < b;





		System.out.println("*******************************");
		System.out.println("*** SHORT CIRCUIT OPERATORS ***");
		System.out.println("*******************************");
		System.out.println();

		myFriendsAge = myFriendsAge + 1;
		myFriendsAge += 1;
		myFriendsAge++;

		myFriendsAge = myFriendsAge - 1;
		myFriendsAge -= 1;
		myFriendsAge--;

		myFriendsAge = a + 4;
		myFriendsAge += 6;

		System.out.println(myFriendsAge);

		result = ( myFriendsAge++ >= 15);

		System.out.println(myFriendsAge + " " + result);

		myFriendsAge = 14;
		result = ( ++myFriendsAge >= 15);

		System.out.println(myFriendsAge + " " + result);

		result = ( myFriendsAge++ >= 15) || (myFriendsAge++ <= 21);

		System.out.println(myFriendsAge + " " + result);




		System.out.println("a = " + a);
		a += 2;
		System.out.println("a = " + a);
		a++;
		System.out.println("a = " + a);
		a--;
		System.out.println("a = " + a);



		System.out.println("*******************************");
		System.out.println("*** IF STATEMENTS ***");
		System.out.println("*******************************");
		System.out.println();

		//----------------------------------------------------

		System.out.println("*** Basic if statement ***");

		int freezingPointFahrenheit = 32;
		int outsideTempFahrenheit = 80;

		// if (condition) statement;
		if (true) {
			System.out.println("I am true");
		}

		if (false) {
			System.out.println("I am false");
		}
		System.out.println("");

		System.out.println("");
		System.out.println("");
		System.out.println("");

		if (outsideTempFahrenheit <= freezingPointFahrenheit) {
			System.out.println("Would you like a nice hot cup of coffee?");
		}
		else {
			System.out.println("Would you like a cool, refreshing iced mocha?");
		}

		//----------------------------------------------------

		System.out.println("*** if-else statement ***");

		boolean condition1 = true;
		boolean condition2 = true;
		if (condition1) {
			System.out.println("Condition 1 is true!");
		} else if (condition2) {
			System.out.println("Condition 2 is true!");
		} else {
			System.out.println("No conditions are true!");
		}

		myFriendsAge = 81;
		System.out.println("My friend is " + myFriendsAge);

		if (myFriendsAge <= 19) {
			System.out.println("My friend is young!");
		}
		else if (myFriendsAge > 65) {
			System.out.println("My friend is old!");
		}
		else if (myFriendsAge < 30) {
			System.out.println("My friend is fairly young!");
		}
		else {
			System.out.println("Meh, whatever");
		}

		if (myFriendsAge > 20) {
			System.out.println("My friend can drink!");

			if (myFriendsAge > 80) {
				System.out.println("But probably only at home");
			}
		}

		if (myFriendsAge > 20) {
			System.out.println("My friend can drink!");
		}
		else if (myFriendsAge > 80) {
				System.out.println("But probably only at home");
		}



		//----------------------------------------------------

		System.out.println("*** a boolean variable is valid boolean expression ***");

		boolean isSunny = true;
		if (true) {
			isSunny = false;
		}

		if (false) {

		}

		if (isSunny) {
			System.out.println("Better wear some sun screen...");
		}

		//----------------------------------------------------

		System.out.println("*** if statements can be used with blocks ***");

		if (outsideTempFahrenheit > freezingPointFahrenheit) {
			System.out.println("Summer time!!!");
		} else {
			System.out.println("Dress in layers");
			System.out.println("Wear gloves");
			System.out.println("Wear hat");
			System.out.println("Wear scarf");
		}

		System.out.println("*******************************");
		System.out.println("*** VARIABLE SCOPE ***");
		System.out.println("*******************************");
		System.out.println();

		int firstVariable = 2;



		//int secondVariable = 0;

		if (firstVariable > 0) {
			int secondVariable = firstVariable;
		}

		//int thirdVariable = secondVariable * 2; // this will cause a compile error because secondVariable is not "in scope"

		//int firstVariable = 3;  // this is a compiler error because we already have a variable named firstVariable in this scope
		int secondVariable = 7; // this is allowed because there is no variable named secondVariable in this scope

		boolean burnItDown = shouldBurnDownTheBuilding(14, 20);
	}

	static boolean shouldBurnDownTheBuilding(int numberOfEmployees, int piecesOfCake) {
		if (numberOfEmployees > piecesOfCake) {
			return true;
		} else {
			return false;
		}
	}
}
