package com.syntax.class17;

public class StaticKeyWord {
	
	//create a template for a Phone
	
	String color;           //Instance variables 
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type, name, parameters

	static void displayGeneralInformation() {                     
		System.out.println("We are building "+brand+" with touch screen "+touchScreen);
	}
// INSTANCE MEBMERS OF THE CLASS CAN ACCESS ALL STATIC METHODS
	void displaySpecification() {             //instance methods (no static keywords)
		System.out.println("We build phone with "+memory+" GB memory in "+color+ " color");
	}
	//  static void displaySpecification1() {             // STATIC METHOD CANNOT ACCESS NON-STATIC VARIABLES
	// 	System.out.println("We build phone with "+memory+" GB memory in "+color+ " color");
//	}
	
	public static void main(String[] args) { //args : name 
		//accessing static method in a static way
		brand = "IPhone";
		touchScreen=true;
	
		//accessing instance method in a static way
	StaticKeyWord obj = new	StaticKeyWord();
	obj.color="grey";
	obj.memory=64;
	
	displayGeneralInformation();
	
	//accessing static method in non static way/througth instance
	obj.displaySpecification();
	obj.displaySpecification();
	
	}
}
