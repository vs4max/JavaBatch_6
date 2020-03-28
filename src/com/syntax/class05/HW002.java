package com.syntax.class05;
import java.util.Scanner;
public class HW002 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F


Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =“Summer”.
At the end of the program we should see output as “You were born ______“.

		 */
 Scanner scan = new Scanner(System.in);
 System.out.println("Please enter your quiz score");
 int quiz = scan.nextInt();
 System.out.println("Please enter your midTerm score");
 int midTerm = scan.nextInt();
 System.out.println("Please enter your final score");
 int finalScore = scan.nextInt();
 		
		int grade = (quiz+midTerm+finalScore)/3;
		if (grade>=90) {
		System.out.println("grade A");
		}else if (grade>=70 && grade<90) {
		System.out.println("grade B");		
		}else if (grade>=50 && grade<70) {
			System.out.println("grade C");
		}else {
			System.out.println("grade F");
		}		
	}
}
