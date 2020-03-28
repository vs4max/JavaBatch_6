package com.syntax.class12;

public class StringManipulationMore {

	public static void main(String[] args) {
		
		//to get substring from a given String 
		//substring = String inside your String
		
System.out.println("____substring() FUNCTION_______");

String str = "Today is raining day";
String partialString = str.substring(6); // from 6 index until end
System.out.println(partialString);

//raining day
partialString= str.substring(9); //index calculate from 0
System.out.println(partialString);

//today
partialString= str.substring(0, 5); // from 0 -5
System.out.println(partialString);

//raining
partialString= str.substring(9, 16);
System.out.println(partialString);

	}

}
