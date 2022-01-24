package com.techelevator;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String amount;

	//	while (condition) {
	//
	//	}
		double costOfItems;
		do  {
			System.out.print("Please enter the cost of the items: " );
			amount = scanner.nextLine();

		}   while (costOfItems >] = 0);

		double amountTendered;
		do {

			double costOfItems = Double.parseDouble(amount);

			System.out.print("Please enter the amount tendered ");
			amount = scanner.nextLine();
			double amountTendered = Double.parseDouble(amount);

		}  while (amountTendered < costOfItems);

		double changeReturned = amountTendered - costOfItems;
		System.out.println("Change returned: "+ changeReturned);

	}

}
