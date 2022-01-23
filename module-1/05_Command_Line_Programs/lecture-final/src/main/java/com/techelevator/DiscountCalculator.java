package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {



        System.out.println("Hi");
        System.out.print("Hi, ");
        String name = "Ben Langhinrichs";
        System.out.println(name);
        String[] states = {"Ohio", "Pennsylvania"};
        for (int i = 0; i < states.length; i++) {
            System.out.print(states[i]+",");
        }
        System.out.println();







        String state = new String();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What state is your favorite? ");
        state = scanner.nextLine();
        System.out.println("Oooh, I like "+state+" too!");


        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        //String scannerResult = scanner.nextLine();
        //double discountAmount = Double.parseDouble(scannerResult) / 100.0;
        double discountAmount = Double.parseDouble(scanner.nextLine()) / 100.0;
//
//        int x = Integer.parseInt(scannerResult);
//        Boolean.parseBoolean()
        // Do Not Use int x = scanner.nextInt();
        //System.out.println(x);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String priceString = scanner.nextLine();
        System.out.println(priceString);
        String[] prices = priceString.split(" ");
        double[] pricesDouble = new double[prices.length];
        System.out.print("Prices offered after discount: ");
        for (int i = 0; i < prices.length; i++) {
            pricesDouble[i] = Double.parseDouble(prices[i]);
            pricesDouble[i] -= pricesDouble[i]*discountAmount;
            System.out.print(pricesDouble[i]+" ");
            //System.out.printf("$%.2f ", pricesDouble[i]);
        }
        System.out.println("");






    }

}
