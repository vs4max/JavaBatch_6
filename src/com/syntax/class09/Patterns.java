package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		 for (int a=1; a<=5; a++) {
			 for(int b=1; b<=5; b++) {
				 System.out.print("*");
			 }
		 }
System.out.println("____PATTERN USING NEXTED LOOPS____");
	for (int i=1; i<=4; i++) {
		for (int j=1; j<=5; j++) {
			System.out.print("*");
		}System.out.println();
	}
		 System.out.println("___________10x10__________");
		  
		 for (int c=1; c<=10; c++) {
				for (int v=1; v<=10; v++) {
					System.out.print("*");
				}System.out.println();
	}

		 System.out.println("___________10x5__________");
		  
		 for (int c=1; c<=10; c++) {
				for (int v=1; v<=5; v++) {
					System.out.print("*");
				}System.out.println();
	}
}}
