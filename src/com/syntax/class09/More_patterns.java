package com.syntax.class09;

public class More_patterns {

	public static void main(String[] args) {
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345 
		 */
		for (int i=1; i<5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j);
			}System.out.println();
	}
		System.out.println("_________-");
		
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 */
		for (int i=1; i<5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(i);
			}System.out.println();
		}
		System.out.println("________5x9__________");
		for (int i=1; i<5; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(j);
			}System.out.println();
	}
		System.out.println("____54321_____-");
		/*
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=1; j--) {
				System.out.print(j);
			}System.out.println();
	}
	
		
		System.out.println("____55555_____-");
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=5; j++) {
				System.out.print(i);
			}System.out.println();
	}
		System.out.println("_________-");
		
	}

}
