package com.syntax.class06;

import java.util.Scanner;

public class SwitchwithString {

	public static void main(String[] args) {
		/*
		 * ask user where he or she from
		 * based on the country we will define favorite food
		 * Your favorite food____ 
		 */

		Scanner scan;
		String country;
		String favoriteFood;
		
		scan = new Scanner (System.in);
		System.out.println("Please enter your country ");
		country=scan.nextLine();
		
		switch (country) {
		
		case  "Morocco":
			favoriteFood="couscous";
			break;
		case  "Belarus":
			favoriteFood="Potato";
			break;
		case  "Tajikistan":
			favoriteFood="Osh";
			break;
		case  "Turkey":
			favoriteFood="Baklava";
			break;
		case  "Afganistan":
			favoriteFood="Mantu";
			break;
		case  "Kasakhstan":
			favoriteFood="Bashparmak";
			break;
		default:
			favoriteFood="Unknown";
		}
		System.out.println("Your faivoride food "+favoriteFood);
	}

}
