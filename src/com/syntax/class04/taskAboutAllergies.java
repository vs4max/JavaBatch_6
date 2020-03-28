package com.syntax.class04;

public class taskAboutAllergies {

	public static void main(String[] args) {
		//if no allergies --> do not eat oranges
		//orange allergies --> do not eat oranges
		//apple allergies --> do not eat apple
		//kiwi allergies --> do not eat kiwi
		 boolean allergy = true;
		 boolean appleAllergy = false;
		 boolean orangeAllergy = true;
		 boolean kiwiAllergy = false;
		 
		 if(allergy) {
		System.out.println("Please answer bellow");
		
		if(orangeAllergy) {		
			System.out.println("Do not eat oranges");
		}
		if (appleAllergy) {
			System.out.println("Do not eat apples");
		}
		if (kiwiAllergy) {
			System.out.println("Do not eat kiwi");
		}
		
	}else {
		 System.out.println("You are healthy");
		 	 
		 
	}
}
}