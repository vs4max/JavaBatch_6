package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {

	public static void main(String[] args) { 
		
	/*  Take age input from a user and then base on the age print output
	 * if age from 0-3 --> baby
	 * if age from 4-5--> kid
	 * if age from 6-12 --> child
	 * if age from 13-19 --> teenager
	 * if age from 20-64 --> adult
	 * if age is more or equal to 65 --> you are a senior*/
	 
		// 1 - Let's declare all variables
		
		int age;
		Scanner scan; //to import we use ctrl+shift+o --> import java.util.Scanner;
		
		// 2 - capture values
		scan = new Scanner(System.in);
		System.out.println("Pease enter your age");
		age = scan.nextInt();
		
		// 3 - perform verification
		
		// ! we use && because the variable should be between the age DO NOT USE "OR" ||
		 
		if (age>=0 && age<3) {
			System.out.println("Baby");
		}else if (age>=4 && age<=5) {
			System.out.println("Kid");
		}else if (age>=6 && age<=19 ) {
			System.out.println("Teenager");
		}else if (age>=20 && age<=64) {
			System.out.println("Adult");
		}else {
			System.out.println("You are enjoyng your life");
		}
		
		
	}

}
