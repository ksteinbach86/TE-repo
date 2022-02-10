package com.techelevator;

import java.io.*;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;


public class FindAndReplace {

    public static void main(String[] args) throws FileNotFoundException {

        // create the search for a word
        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to search for?");
        String searchWord = scanner.nextLine();

        System.out.println("What word would you like to replace " + searchWord + " ?");
        String replacedWord = scanner.nextLine();

        System.out.println("Please enter the file you're looking to access.");
        String origin = scanner.nextLine();
        File originFile = new File(origin);

        System.out.println("Where would you like to put your file?");
        String destination = scanner.nextLine();
        File destinationFile = new File(destination);


        try (Scanner input = new Scanner(originFile);
            PrintWriter output = new PrintWriter(destinationFile)) {
            while (input.hasNextLine()) {
                String lineOfInput = input.nextLine();
                output.println(lineOfInput.replace(searchWord, replacedWord));

                }
            }

         catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}

































