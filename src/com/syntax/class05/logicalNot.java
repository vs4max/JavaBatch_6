package com.syntax.class05;

public class logicalNot {

	public static void main(String[] args) {
		
		// NOT ( ! ) - reserve the condition
		boolean b =!true;
		boolean val =!false;
		
		System.out.println("b");
		System.out.println("val");
		
		boolean isCold=true;
	 if (!isCold) {
		 System.out.println("Hello!");
	 }else {
		 System.out.println("Bye!!!");
	 }
	 
	String day1="Tuesday";
	
	//if it is monday or friday --> Find me on Syntax
	
	if(!day1.equals("Monday") && !day1.equals ("Friday")) {
		System.out.println("Find me at Syntax");
	}
	//my day is NOT Friday or Monday
	if(!(day1.equals("Monday") && !day1.equals ("Friday"))) { // RIGHT ! ! !  Use parentheses ( )
		System.out.println("Find me at Syntax");
	}
	
	
		
	}

}
