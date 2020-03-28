package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// ones i=4 --> we want to stop the loop

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("I'm stopping the loop");
				break; 
			}
			System.out.println(i);
		}
		System.out.println("I'm outside of the loop");
		System.out.println("________CONTINUE_________");
		
		for(int y=1; y<=10; y++) {
			if (y==4) {
				System.out.println("I am skipping interation");
				continue;
			}
			System.out.println("I'm inside the code");
			System.out.println(y);
			
		}
		// write a program that print numbers 1-20
		// i do not want to print 5,6,7
		
		for (int a=1; a<21; a++) {
			if (a==5 || a==6 || a==7) {
				continue;
			}
			System.out.println(a);
		}
		System.out.println("______CONTINUE EXAMPLE_______");
		//write the program 1-100 no print 35-55
		for(int i=1; i<=100; i++) {
			if (i>=35 && i<=55) {
				continue;
			}System.out.println(i);
		}
		
		
	}

}
