package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String quizPath = "test_quiz.txt";
		File quizInputFile = new File(quizPath);
		String line = "";

// Should probably create a separate class (OOP) called Question,
// but we can do it this way too

		List<String[]> quiz = new ArrayList<>();
		int finalCorrect = 0;

		// Read in the quiz questions
		try (Scanner quizInput = new Scanner(quizInputFile)) {
			while (quizInput.hasNextLine()) {
				line = quizInput.nextLine();
				// should be: Question-1|answer-1|answer-2|correct-answer*|answer-4
				if (line.length() > 0 && line.contains("|")) {
					quiz.add(line.split("\\|"));
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + quizInputFile.getAbsolutePath());
			System.exit(1);
		}

		//Loop through the questions asking one at a time
		//display each answer, keeping track of correct answer
		for (String[] question : quiz) {
			System.out.println(question[0]);
			int correct = -1;
			for (int i = 1; i < question.length; i = i++) {
				if (question[i].endsWith("*")) {
					correct = i;
					System.out.println(i + ". " + question[i].substring(0, question[i].length() - 1));
				} else {
					System.out.println(i + ". " + question[i]);
				}


				//ask user for their answer
				System.out.print("Your answer, please: ");
				line = scanner.nextLine();
				if (line.equals(Integer.toString(correct))) {
					System.out.println("RIGHT!");
					finalCorrect++;
				} else {
					System.out.println("WRONG! The correct answer is " + question[i].substring(0, question[i].length() - 1));
				}
			}


			//tell user final score
			System.out.println("Quiz over. You got " + finalCorrect + " out of " + quiz.size());


		}

	}
}