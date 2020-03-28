package com.syntax.class04;

import java.util.Scanner;

public class ScannEx {

	public static void main(String[] args) {
		/*Capture 2 number from a user
		 * Compare number and identify which is larger 
		 */
		Scanner input = new Scanner (System.in);
		System.out.println("Pls enter first number");
		int num1= input.nextInt();
		
		System.out.println("Pls enter second number");
		int num2= input.nextInt();
	// we compare 2 numbers
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		
		}else if (num1==num2) {
		System.out.println(num1 +" is equal "+ num2);
	
		}else {
		System.out.println(num2+"is larger than "+num1);
		
		}
	
	}
}
