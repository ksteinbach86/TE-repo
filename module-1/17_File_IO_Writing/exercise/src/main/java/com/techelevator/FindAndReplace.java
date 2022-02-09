package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.awt.geom.Path2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Scanner;

public class FindAndReplace<path> {




    public static File main(String[] args) throws IOException {

        // create the search for a word PLUS case-sensitive
        //the destination file another try/catch here for invalid destination file
        //the source file (existing) try/catch here if user enters invalid file

        Scanner fileInput = new Scanner(System.in);
        System.out.println("Please enter the word you wish to search for >>>");
        String path = fileInput.nextLine();
        File inputFile = new File(path);

        if (!inputFile.exists()) {
            System.out.println(path + " does not exist. So sorry!");
            System.exit(1);

        } else if (!inputFile.isFile()) {
            System.out.println(path + " is not a file");
            System.exit(1);

        }
        return inputFile;
    }


//    File newPath = new File(path);
//        System.out.println("Let's create a directory.");
//        System.out.print("Enter the path of the new directory: ");
//        path = userInput.nextln();
//        File newDirectory = new File(path);
//
//        if (newDirectory.mkdir()) {
//            System.out.println(newDirectory.getAbsolutePath() + " already exists");
//        }
//        else {
//            if (newDirectory.mkdir()) {
//                System.out.println("Made it!");
//            }
//            else {
//                System.out.println("Didn't make it");
//                System.exit(1);
//            }
//        }



//        File inputFile = getInputFileFromUser();
//    public static File getInputFileFromUser() {



    private static void caseSensitiveLine(File inputFile, String searchWord) {
    }

    //create fir the word to replace the search word with
    public void shouldReplaceSingleWord() throws IOException {
        String searchStr0 = "Bacon";
        String searchStr1 = "bacon";
        String searchStr2 = "spinach";
    }






















}
