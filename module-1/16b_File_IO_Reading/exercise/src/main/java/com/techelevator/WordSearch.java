package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		String file;
		String word;
		String caseSensitive;

		System.out.println("Please enter path to input file >>> ");
		file = scanner.nextLine();
		System.out.println("Please enter a word to search");
		word = scanner.nextLine();
		System.out.println("Would you like your search to be case sensitive? Y or N ");
		caseSensitive = scanner.nextLine();

		int count = 0;
		File userFile = new File(file);

		try (Scanner userInput = new Scanner(userFile)); {
			Scanner userInput = null;
			while (userInput.hasNextLine()) {
				count++;
				String lineOfInput = userInput.next();

				if (caseSensitive.equals("n") && userInput.toLowerCase().contains(word.toLowerCase())) {
					count++;
				}
				if (lineOfInput.contains(word) && caseSensitive.equals("y")) {
					System.out.println(count + ") " + lineOfInput);

				}
			}
		}

				} catch(FileNotFoundException e) {
					System.out.println("Your file doesn't exist");
				}




		}














//	private static File getInputFileFromUser() throws FileNotFoundException {
//
//
//		String path = userInput.nextLine();
//
//		File inputFile = new File(path);
//		if (!inputFile.exists() == false) {
//			System.out.println(path + " Does not exist");
//	//		System.exit(1);
//
//		} else if (inputFile.isFile() == false) {
//			System.out.println(path + "is not a file");
//	//		System.exit(1);
//
//		}
//		return inputFile;
//
//	}
//
//	public static String wordToSearch() {
//		Scanner userInput = new Scanner(System.in);
//
//		String searchWord = userInput.nextLine();
//
//		return searchWord;
//
//	}









