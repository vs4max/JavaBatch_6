package com.syntax.class08;

import java.util.Scanner;

public class task2 {
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.print("Do you want to apply for credit card? ");
			String creditCard = scan.next();
			if (creditCard.equals("yes")) {
				System.out.println("Congratulations!");
				break;
			}
		}}		}