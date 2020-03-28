package com.syntax.class07;
import java.util.Scanner;

public class lottery2 {

	public static void main(String[] args) {
		
		
		/*
		 * we are playing a lottery and lucky number is 17
		 * we want to keep asking user any number from 1-20
		 * until he guess the lucky number --> congrats
		 */

		Scanner scan;
		int num1;
		int luckyNumber=17;
		String congrats;
		scan= new Scanner(System.in);
		do {
			System.out.println("Please enter any number from 1-20");
			num1=scan.nextInt();
		}while (num1!=luckyNumber); 
			System.out.println("Congrats");
			
		}
	}

