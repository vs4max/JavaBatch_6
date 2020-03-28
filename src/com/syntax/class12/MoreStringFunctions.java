package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		String me = "I am a good tester";
		
		System.out.println("_________replace() FUNCTION_________");
		
		String newString = me.replace("a","c");
		System.out.println(newString);
		
		me = me.replace("good", "great");
System.out.println(me);

me = me.replace("great","awesome");
System.out.println(me);


	}

}
