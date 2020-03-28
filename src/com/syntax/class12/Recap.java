package com.syntax.class12;

public class Recap {

	public static void main(String[] args) {
		String  str="";//empty value 
		System.out.println(str.isEmpty());

		String str1=null; //no value at all (null)
		System.out.println(str1.isEmpty()); // Runtime-->NullPointExeption
	System.out.println("_____CONCAT_______"); //сцепление
	
	String str2 = " Good morning ";
	String str3 ="Students";
	String str4 ="!";
	//" Good morning "-->"Good morning"-->"Good morningStudents"-->"Good morningStudents!"
	str2=str2.trim().concat(str3).concat(str4);
	
	String str5 = "Day";
	int date =25;
	//date.concat         !!! work with only string !!!!  CE : change type
	
	System.out.println(str2);
	
	System.out.println("_________TRIM_&_CONCAT________"); //обрезка
	String str6=" Hello ";
	String str7="Syntax";
	str6=str6.concat(str7).trim(); // будет вначале сцепление потом обрезка --> что первое поставишь - то и будет работать
	System.out.println(str6);//"Hello Syntax"
		
	/*
	 * str6=str6.trim().concat(str7);
	  System.out.println(str6);//"HelloSyntax"	
	 */
		
	
	
	
	
	}

}
