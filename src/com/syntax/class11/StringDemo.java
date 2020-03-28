package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {

		String school = "Syntax";
		String str = new String("HELLO ");
		String str1 = "This a  String 7676,&^&^";

		System.out.println("_____LENGTH FUNCTION_______");
		// how many characters String Has
		System.out.println(school.length());

		int size = str.length();
		System.out.println("String length is " + size);

		// convert String to lower or uppercase
		System.out.println("_____TO UPPER CASE/TO LOWER CASE________");
		System.out.println(school.toUpperCase());
		System.out.println(str.toUpperCase());
		str = str.toLowerCase();
		System.out.println(str);

		System.out.println("________CONCAT  FUNCTION_______ ");
		// concatinate 2 String
		String newString = str + school;
		System.out.println(newString);
		
		String day="Sutturday ";
		String date="14";
		
		String newDate = day.concat(date);
		System.out.println(newDate);
		
		char grade ='A';
		String str2="Student"; 
		
		//str.concat(grade) --> cannot use if it not STRING ( CE-- compiler error) 
		//str.concat() method is used to attach 1 string to another String 
		
		System.out.println("_______is EMPTY FUNCTION______");
		//tells true or false if there is no characters inside the String
		//tells false if any characters are inside the String
		
		String str3="jnuu";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("___________TRIM () FUNCTION_________");
		//removes empty/white space at the  beginning and end of the String  
		
		String str4="         Welcome to Syntax!          ";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spases: "+str4);	
		
	}

}
