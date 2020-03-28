package com.syntax.class05;

public class logicalOperators {


	public static void main(String[] args) {
		/* We have total seven days a week
		 * if day is 2 or 3 --> SDLC class
		 * if day is 6 or 7 --> Java class
		 * if day 1 or 5 --> Off day
		 * if day 4 --> review class  
		 */
		int day = 6;
		
		// AND - can be only one variable
		
		// to compare numbers we use equality operator "=="  ! ! !
		
		if (day ==2 || day==3) {
			System.out.println("Today is SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("Today is Java class");
		}else if (day==1 || day==5) {
			System.out.println("Day off");
		}else if (day==4) {
			System.out.println("Review class");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("______using string_____");
		
		//to compare String we use equals
		String day1 = "Suturday";
		 if (day1.equals("Thuesday") || day1.equals("Wednesday")) {
			 System.out.println("Today is SDLC class");
		 }else if (day1.equals("Suturday") || day1.equals("Sunday")) {
			 System.out.println("Today is Java class");
		 }else if (day1.equals("Monday") || day1.equals("Friday")) {
		System.out.println("Day off");
		 }else if (day1.equals ("Thusday")) {
		System.out.println("Review class");
	 }else {
		System.out.println("Invalid day");
	}
		 
	}
}
