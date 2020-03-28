package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		//Declare a number and compare if number is larger than 100
		//If number is larger than 100 --> my number is large
		
		System.out.println("Starting cooding");
		
		int num=178;
		
		if (num>100) {
			System.out.println("My number is large"); // {} put and work if the sentence is true
		}
		
		System.out.println("End of the program"); // if condition not work and work
		System.out.println("___________________");
		
		int expectedHours=15;
		int actualHours=20;
		// if actual is more than expected --> you will love Java
		
		if(actualHours>=expectedHours) {//if true go inside "if" block
			System.out.println("You will love Java");
		}else {//otherwise (if else) --> go inside "else" block 
			System.out.println("You will not love Java");
			
			System.out.println("________________");
			
			double budget=10000;
			double carPrice=120000;
			//using if we are doing verification are selective execution
			 if(budget>carPrice) {
				 System.out.println("I'll buy a car toay");
			 }else {
				 System.out.println("I will not buy a car today,"+" I wii go learn Java");
			 }
			  
			System.out.println("I am code after if condition");
		} 
	}

}
