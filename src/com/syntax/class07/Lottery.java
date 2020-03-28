package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		
		/*
		 * we are playing a lottery and lucky number is 17
		 * we want to keep asking user any number from 1-20
		 * until he guess the lucky number --> congrats
		 */

		Scanner scan;
		int num1=17;
		String congrats; 
		scan= new Scanner(System.in);
		
		while (num1<=20) {
			System.out.println("Please enter any number from 1-20");
			num1=scan.nextInt();
		
			if (num1>17 || num1<17) {
				System.out.println("Try again");
			}else {
				System.out.println("Congrats");
				break;
			}
				
		}
	}}


