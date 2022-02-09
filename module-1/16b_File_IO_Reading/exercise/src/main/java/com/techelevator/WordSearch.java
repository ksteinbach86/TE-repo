package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What would you like to search for?");
		String userFileName = scanner.nextLine();
		File inputLine = new File(userFileName);
		System.out.println("What is the word you are looking for?");
		String searchWord = scanner.nextLine();
		int lineCounter = 1;
		System.out.println("Is your search word case sensitive? Y/N");
		boolean isCaseSensitive = scanner.nextLine().toLowerCase().equals("y");

		try (Scanner fileScanner = new Scanner(inputLine.getAbsoluteFile())) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if ( !isCaseSensitive) {
					if (line.toLowerCase().contains(searchWord.toLowerCase())) {
						System.out.println(lineCounter + ") " + line);
					}

				}else {
					if (line.contains(searchWord)) {
						System.out.println(lineCounter + ") " + line);
					}
				}
				lineCounter++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found, I'm sorry!");
		}
	}

	}








