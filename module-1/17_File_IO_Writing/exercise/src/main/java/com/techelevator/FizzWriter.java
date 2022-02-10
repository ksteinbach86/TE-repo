package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter location for your new file?");
		String dataFile = input.nextLine();
		File writeFile = new File(dataFile);

		try (PrintWriter dataOutput = new PrintWriter((writeFile))) {
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					dataOutput.println("FizzBuzz");
				} else if (i % 5 == 0) {
					dataOutput.println("Buzz");

				} else if (i % 3 == 0) {
					dataOutput.println("Fizz");
				} else dataOutput.println(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, this location is invalid. Pleasetry again!");
		}

	}
}