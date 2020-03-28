package com.syntax.class04;

import java.util.Scanner;

public class ScanTask {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is the amount on loan need?");
		int num1= input.nextInt(); 
		
	// we compare 2 numbers
		int num2 = 200000;
		if (num1<num2) {
			System.out.println("You can get money in our bank");
		
		}else if (num1==num2) {
		System.out.println("I have to ask manager");
	
		}else {
		System.out.println("Unfortunatelly, but you cannot get money");
		
		}
	}
 
	
		System.out.println("____task 2______");
		
		Scanner input1 = new Scanner (System.in);
		System.out.println("How old are you?"); 
		int num3= input1.nextInt();
		
	// we compare 2 numbers
		int num4 = 18;
		if (num1<num2) {
			System.out.println("");
		
		}else if (num3==num4) {
		System.out.println("I have to ask manager");
	
		}else {
		System.out.println("Unfortunatelly, but you cannot get money");
		
		}
	
		
	}
}
