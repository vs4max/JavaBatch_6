package com.syntax.class12;

public class Manipulations {

	public static void main(String[] args) {
		
		System.out.println("______charAt() FUNCTION________"); //показывает букву заданную в индексе
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		System.out.println(letter1); 
		
		char letter5=str.charAt(4);
		System.out.println("Letter at the index 4 is "+letter5+".");
		
		/*
	!	char someLetter5 = str.charAt(55); --> RunTime : StringIndexOutOfBoundsException: String index out of range: 55
	!	System.out.println(someLetter5);
		*/
		
		
		//get all characters 1 by 1 from a String 
		
		char letter;
		for(int i=0; i<str.length(); i++) {
		
			letter=str.charAt(i); //  --> этим указывешь сколько и что покажешь в ответе
			System.out.print(letter+" ");
		}
		System.out.println();
		System.out.println("________indexof() FUNCTION________"); // --> ПОКАЗЫВАЕТ КАКАЯ БУКВА ПО СЧЕТУ
		 
		String name="Syntax Technologies";
		int index=name.indexOf("y");
		 System.out.println(index); // --> отсчет начинается с 0 !!!
		
		index = name.indexOf(" ");
		System.out.println(index);
		
		index = name.indexOf("Syntax");
		System.out.println(index); // --> работает только с 1 буквой 
		
		index = name.indexOf("!");
		System.out.println("Index is not existing character "+index);
		
		index = name.indexOf("Technologies");
		System.out.println(index); // --> покажет с какого индекса начнется слово Technologies --> 7
		
		index = name.indexOf("o");
		System.out.println("Index of first o = "+index);
		
		index = name.lastIndexOf("o");
		System.out.println("Index of second  o = "+index);
		
		
	}

}
