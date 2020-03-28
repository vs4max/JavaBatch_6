package com.syntax.class05;

import java.util.Scanner;

public class ScnnerANDLogical {

	public static void main(String[] args) {
		
		/*You are salesman
		 * Ask user for how much his sales are 
		 * based on the amount of sales we need to calculate commission
		 * if sales are between 1-100 --> commission be 10%
		 * if sales are between 100-500 --> commission be 20%
		 * if sales are more 500 --> commission be 30%
		 */
		
		//if your sale are 200 --> 40 dollars
		
		//1. declare all variables what i will need
		
		Scanner scan;
		double sales;
		double commission;

	 scan = new Scanner(System.in);
		System.out.println("Please print your sales amount");
		sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100 ) {
			//give user 10% commission
			System.out.println("Based on your sales your commission is "+ (sales*0.1));
			commission = sales*0.10;
		}else if (sales>100 && sales<=200) {
			//give a user 20% commission
			System.out.println("Based on your sales your commission is "+ (sales*0.2));
			commission = sales*0.2;
		}else if (sales>200 && sales<=500) {
			//give a user 30% commission
			System.out.println("Based on your sales your commission is "+ (sales*0.3));
			commission = sales*0.3;
		}else {
		//give a user 50% commission
			System.out.println("Based on your sales your commission is "+ (sales*0.5));
		commission = sales*0.3;
		
		}
		if (commission>100) {
			System.out.println("You are awesome saller");
		}
}
}
