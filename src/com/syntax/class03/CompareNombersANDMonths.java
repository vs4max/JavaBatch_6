package com.syntax.class03;

public class CompareNombersANDMonths {

	public static void main(String[] args) {
		double numberOne = 10;
		double numberTwo = 10;

		if (numberOne > numberTwo) {
			System.out.println("Nomber One larger than number Two");
		} else
			System.out.print("");

		System.out.println("______________");

		int month = 30;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("invalid month");
		}

		System.out.println("___________");

		int a = -5;
		if (a > 0) {
			System.out.println("The number is positive");
		} else if (a == 0) {
			System.out.println("The number is equal 0");
		} else
			System.out.println("The number is negative");

		System.out.println("_____________");

		int x = 5;
		if (x % 2 == 0) {
			// int x=5; --> x=x%2; --> if(x==0) ask about!!!!
			System.out.println("The number is even");

		} else
			System.out.println("The number is odd");

	}
}
