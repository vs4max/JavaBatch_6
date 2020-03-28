package com.syntax.class08;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off the amount. If user give more money program
		 * should return a change. Whenever a user done with payments program should say
		 * “Thank you for shopping!
		 */
		String item;
		double price;
		double payment;
		double total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the item you want to buy?");
		item = sc.next();
		System.out.println("Whats is the price of " + item);
		price = sc.nextDouble();
		do {
			System.out.println("Please enter your payment");
			payment = sc.nextDouble();
			total=total+payment;
			double remain=price-total;
			if (remain<0) {
				System.out.println("here is your return " + (payment - price));
				break;
			}else if (remain!=0) {
				System.out.println("Please pay more "+remain);
			} else {
				System.out.println("Thank you for shopping!");
				break;
			}
		} while (price != payment) ;

	}

}
