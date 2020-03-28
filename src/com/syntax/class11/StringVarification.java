package com.syntax.class11;

public class StringVarification {

	public static void main(String[] args) {
		
		String message ="Welcome admin!";
		System.out.println("________contains() FUNCTION________");
		//verify that message contains username which is Admin
		
		System.out.println(message.contains("Admin"));
		boolean flag = message.contains("Welcome");        //ЧТО-ТО Я НЕ ПОНЯЛА.... ЭТО ТОЛЬКО С BOOLEAN РАБОТАЕТ??? 
		System.out.println(flag);
		
		
		System.out.println("__________startsWith() FUNCTION________");
		//we want to see if welcome starts with Welcome
		
		boolean starts= message.startsWith("Welcome");
		System.out.println(starts);

		System.out.println("______endsWith() FUNCTION_________");
		//we want to verify that welcome message ends with username
		
		String username="Admin";
		boolean ends= message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));   
		
		
		
		
		
	}

}
