package com.syntax.class12;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people’s first names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

Collapse
		 */
Scanner scan = new Scanner (System.in);
System.out.println("What is Mom's first name?");
String mom = scan.nextLine();
System.out.println("What is Dad's feist name?");
String dad = scan.nextLine();
System.out.println("Boy or Girl?");
String baby = scan.nextLine();

String SuggestedBabyName = null;

int half1 = mom.length()/2;
int half2 = dad.length()/2;

if(baby.equalsIgnoreCase("Girl")) {
	SuggestedBabyName = mom.substring(0, half1) + dad.substring(half2);
	System.out.println(SuggestedBabyName);
}else if (baby.equalsIgnoreCase("Boy")) {
	SuggestedBabyName = dad.substring(0, half2) + mom.substring(half1);
	System.out.println(SuggestedBabyName);
}
		
	}

}
