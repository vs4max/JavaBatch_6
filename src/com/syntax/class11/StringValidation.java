package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1 = "Welcome Syntax students";
		String str2 ="Welcome Syntax Students";
		
		//to compare two Strings
		System.out.println("__________EQUALS() equalsIgnoreCase() FUNCTION ___________");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); //почему если добавить пробел это будет правда????    (больше знаков??)
		
		String expected="Home - Syntax Technologies"; //from user story
		String actual="Home - Syntax Technologies     "; //from test story
		
		if (actual.equals(expected)) {
			System.out.println("This case pass. Title are matched");
		}else {
			System.out.println("This case Fails. Title are NOT matched");
		}
		
		
		System.out.println("______FIRST TRIM AND THEN COMPARE_________");
		if (actual.trim().equals(expected)) {
			System.out.println("This case pass. Title are matched");
		}else {
			System.out.println("This case Fails. Title are NOT matched");
		}
		String browser="CHROME";
		//if(browser.trim)
		
		
		
		}
	}


