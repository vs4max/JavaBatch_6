package com.syntax.class12;

public class Syntax_xatnaS {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */

		String str="Syntax";
		char reverse;
		for (int i=str.length()-1; i>-1; i--) {
		reverse = str.charAt(i);
		System.out.print(reverse);
		}
		System.out.println();
	}

}
