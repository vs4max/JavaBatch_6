package com.syntax.class08;

import java.util.Scanner;

public class Task3 {
public static void main(String []args) {
	/*
	 * Write a program that reads a range of integers (start and end point), 
	 * provided by a user and then from that range prints the sum of the even and odd integers.

	 */
	
	
	Scanner scan = new Scanner(System.in);
	int totalEven = 0;
	int totalOdd = 0;
			System.out.print("Please enter two numbers: ");
			int min = scan.nextInt();
			int max = scan.nextInt();
			for (int i = min; i <=max; i++) {
				if (i % 2 == 0) {
					totalEven = totalEven + i;
				}
				else {
					totalOdd = totalOdd + i;
				}
			}
			System.out.format("The total of even numbers between %d to %d is %d.\n", min , max , totalEven);
			System.out.format("The total of odd numbers between %d to %d is %d.\n", min , max , totalOdd);
}
}
