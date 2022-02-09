package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		File dataDirectory = new File("data");
//		String[] files = dataDirectory.list();
//		for (String file : files) {
//			if (file.endsWith("Quiz.txt")) {
//				System.out.println("Do you want to take the " + file.substring(0, file.length()-8) + " quiz?");
//			}
//		}

		String quizPath = "test_quiz.txt";
		File quizInputFile = new File(quizPath);
		String line = "";

		List<String[]> quiz = new ArrayList<>();
		int finalCorrect = 0;

		// Read in the quiz questions
		try (Scanner quizInput = new Scanner(quizInputFile)) {
			while (quizInput.hasNextLine()) {
				line = quizInput.nextLine();
				// Should look like Question-1|answer-1|answer-2|correct-answer*|answer-4
				if (line.length() > 0 && line.contains("|")) {
					quiz.add(line.split("\\|"));
				}
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + quizInputFile.getAbsolutePath());
			System.exit(1);
		}

		// loop through the questions, asking one at a time
		for (String[] question : quiz) {
			System.out.println(question[0]);
			int correct = -1;
			for (int i = 1; i < question.length; i = i + 1) {
				if (question[i].endsWith("*")) {
					correct = i;
					System.out.println(i + ". " + question[i].substring(0, question[i].length()-1));
				}
				else {
					System.out.println(i + ". " + question[i]);
				}
			}
			System.out.println();

		// ask user for their answer
			System.out.print("Your answer, please: ");
		line = scanner.nextLine();
		if (line.equals(Integer.toString(correct))) {
			System.out.println("RIGHT!");
			finalCorrect++;
		}
		else {
			System.out.println("WRONG! The correct answer is " + question[correct].substring(0, question[correct].length()-1));
		}
			System.out.println();

		}


		// tell user final score
		System.out.println("Quiz over. You got " + finalCorrect + " out of " + quiz.size());


	}

}
