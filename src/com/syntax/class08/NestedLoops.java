package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello");

			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");
			}
		}
		System.out.println("_______________");

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);

			for (int y = 1; y <= 3; y++) {
				System.out.println(y);
			}
		}
		System.out.println("_______________");

		for (int i = 1; i <= 3; i++) {

			for (int y = 1; y <= 3; y++) {
				System.out.println(i+" "+y);
			}
		}
		System.out.println("_______________");

		for (int i = 1; i <= 3; i++) {

			for (int y = 3; y <= 3; y++) {
				System.out.println(i+" "+y);
			}
		}

	}

}
