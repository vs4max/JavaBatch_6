package com.syntax.class01;

public class Variables {

	public static void main(String[] args) {
		
		String name ="Viktoriia";
		String lastName ="Stremple";
		char grade ='A';
		// один символ или букву в ''
		String city ="Pittsburgh";
		String state ="PA";
		int cellPhone =987654321;
		// or long phoneNumber = 9876543211l; если число длинное на конце используй long и l в конце
		
		grade='B';
	// помогает присвоить новое значение в ответе
		city="California";
		cellPhone=123456789;
		state="PA but I want live in LA";
		
		System.out.println("My name is " +name);
		System.out.println("My last name is "+lastName);
		System.out.println("My grade is "+grade);
		System.out.println("I live in city of "+city);
		System.out.println("I live in state of "+state);
		System.out.println("Phone number "+cellPhone);
	}  

} 
