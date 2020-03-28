package com.syntax.class04;

public class NestetedStatement {

	public static void main(String[] args) {
		 //declare date and day.
		//if day is Friday --> if date is 13 --> watch a scary movie 
		//                 --> if day is not --> watch a comedy
		
		boolean isFriday= false;
		int date=14;
		
		if (isFriday) {
		System.out.println("Today is Fraday, I am going to a movies");
		
		if (date==13) {
			System.out.println("I'll watch a scary movie");
			
		}else {
			System.out.println("I'll watch a comedy");
		}
		} else {
		System.out.println("Today is not Frayday, I am staying home");
	
		}
	}
}
	


	