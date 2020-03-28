package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		/*
		 * if student completed the quiz we will check a score if score > 90 --> great
		 * job if score > 80 --> well done if score >70 --> you could have done better
		 * 
		 * if student did not completed the quiz --> no good please do homework on time
		 */

		boolean quizCompleted = true;
		int score = 86;

		if (quizCompleted) {
			System.out.println("Lets check your score");

			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Well done");
			} else if (score > 70) {
				System.out.println("You could have done better");

			} else {
				System.out.println("You failed");
			}

		} else {
			System.out.println("Please do homework on time");
		}

		System.out.println("_______TASK 1______");

		boolean diploma = false;
		double gpa = 3.84;

		if (diploma) {
			System.out.print("Congtulations ! ! !");

			if (gpa >= 3.5) {
				System.out.println(" You are elible for scholaship");
			} else {
				System.out.println("You should have studied hurder");
			}
		} else {
			System.out.print("Whould you like to get a degree ? ? ?");
		}
	
}
