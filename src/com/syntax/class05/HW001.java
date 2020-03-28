package com.syntax.class05;
public class HW001 {
public static void main(String [] args ) {
	/*
	 * Write a program to find largest of three double values using if-else..
	 * if and logical operators provided by a user 
	 * (numbers must be distinct)
	 */
	
	
	
	double num1 = 1;
	double num2 = 4;
	double num3 = 3;
	
	// AND - && - should be both conditions TRUE --> other will be FALSE
	// OR - || - should be one condition true --> others will be FALSE
	      // F     or     
	if (num1==num2 || num1==num3) {
		System.out.println("Invalid number");
	}else if (num1>num2 && num1>num3) {
		System.out.println(num1 +" is the largest number");
	}else if (num2==num1 || num2==num3) {
		System.out.println("Invalid number");
	}else if (num2>num1 && num2>num3) {
		System.out.println(num2+" is the largest number");
	}else if (num3==num1 || num3==num2) {
		System.out.println("Invalid number");
	}else {
		System.out.println(num3+" is the largest number");
	}
}	
}

