package com.syntax.class18;

public class Car {

	String make, model, color;
	int year;
	
	public void info() {
		
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+ " color");
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.info();
		
		
	}
	
	
}
