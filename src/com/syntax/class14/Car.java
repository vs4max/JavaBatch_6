
package com.syntax.class14;

public class Car {

	//define features of a car 
	
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//features should be out side of MAIN METHOD 
	
	// public static void main(String[] args) {
		
	// Car car1 = new Car();	
	
	//define behavior
	
	void  drive() {
	// name of method 
	System.out.println(make+" can drive");
	
	}
	void accelerate() {
		System.out.println(make+" can accelerate");
	} // all methods have to be separated 
	
	void makeNoise() {
		System.out.println(make+" makes noise");
	}
	void stop() {
		System.out.println(make+" stops when you press break");
		System.out.println(make+" will stop");
	}
	}
	

