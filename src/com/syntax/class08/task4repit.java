package com.syntax.class08;

import java.util.Scanner;

public class task4repit {

	public static void main(String[] args) {
		/*
		 * write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off the amount. If user give more money program
		 * should return a change. Whenever a user done with payments program should say
		 * “Thank you for shopping!”
		 * 
		 */
		Scanner s;
		String item;
		double price;
		double amount=0;
		double change;
		double money;
		double remainingBalence;

		s = new Scanner(System.in);
		System.out.println("What are you byuing today??");
		item = s.nextLine();

		System.out.println("What is the price??");
		price = s.nextDouble();

		do {
			System.out.println("Please give payment");
			money=s.nextDouble();
			
		amount=amount+money;
		
			if (amount<price) {
				remainingBalence=price-money;
				System.out.println("Please give more "+remainingBalence);
			}else if (amount>price) {
				change=amount-price;
				System.out.println("Here is your cahnge "+change);
				break;
			}else {
				System.out.println("correct payment");
			}
		
		}while (price!=money);
		
		System.out.println("Thank you for shopping");
	}

}
