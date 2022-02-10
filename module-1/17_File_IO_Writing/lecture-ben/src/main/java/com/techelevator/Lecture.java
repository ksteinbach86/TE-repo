package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);



		System.out.print("Enter the path of a file: ");
		String path = userInput.nextLine();
		File file = new File(path);

		if (file.exists()) {
			System.out.println("name: " + file.getName());
			System.out.println("fullpath: " + file.getAbsolutePath());

//			if (file.isDirectory()) {
//				System.out.println("type: directory or folder");
//			}
//			else {
//				System.out.println("type: file");
//			}

			// (condition ? option-if-true : option-if-false)
			System.out.println("type: " + (file.isDirectory() ? "directory or folder" : "file"));

		} else {
			System.out.println(file.getAbsolutePath() + " does not exist");
		}

		// Create a directory
		System.out.println();
		System.out.println("Let's create a directory.");
		System.out.print("Enter the path of the new directory: ");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if (newDirectory.exists()) {
			System.out.println(newDirectory.getAbsolutePath() + " already exists");
		}
		else {
			if (newDirectory.mkdir()) {
				System.out.println("Made it!");
			}
			else {
				System.out.println("Didn't make it");
				System.exit(1);
			}
		}

		System.out.println();
		System.out.println("Create a file to put into the directory.");
		System.out.print("Enter a name for the new file: ");
		path = userInput.nextLine();
		File newFile = new File(path);


		String message;
		try (PrintWriter writer = new PrintWriter(new FileOutputStream(path, true))) {
			do {
				System.out.print("Enter a message: ");
				message = userInput.nextLine();
				writer.println(message);
			} while (!message.equals(""));
		}

		//System.out.println("Size of new file is " + newFile.length());
		System.out.printf("Format length=%d name=%s\n", newFile.length(), newFile.getName());

		System.out.println("Enter the path of the input file: ");
		String inputPath = userInput.nextLine();
		File inputFile = new File(inputPath);
		String inputMessage;
		try (Scanner inputFromFile = new Scanner(inputFile);
			 PrintWriter writer = new PrintWriter(new FileOutputStream(path, true)) ){
				while (inputFromFile.hasNextLine()) {
					inputMessage = inputFromFile.nextLine();
					writer.println(inputMessage.length() + ": " + inputMessage);
				}

		}




	}

}
