package com.syntax.class14;

import java.util.Scanner;

public class Phone {
	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific  attributes and behaviors.
	 */
	
	String model;
	int price;
	int camera;
	String color;
	
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.model = "IPhone";
		phone1.price = 1000;
		phone1.camera = 13;
		phone1.color = "green";
		
		phone1.ring();
		phone1.playGames();
		phone1.setAlarms();
		phone1.textMessages();
		System.out.println();
		//2nd phone
		Phone phone2 = new Phone();
		phone2.model = "Android";
		phone2.price = 680;
		phone2.camera = 12;
		phone2.color = "blue";
		
		phone2.ring();
		phone2.playGames();
		phone2.setAlarms();
		phone2.textMessages();
		System.out.println();
		//3rd phone
		Phone phone3 = new Phone();
		phone3.model = "Nokia";
		phone3.price = 100;
		phone3.camera = 3;
		phone3.color = "orange";
		
		phone3.ring();
		phone3.playGames();
		phone3.setAlarms();
		phone3.textMessages();
		
		System.out.println();
		
		String str="Hello friends";
		str = str.replace("Hello", "Welcome");
		System.out.println(str);
		
		Scanner scan = new Scanner (System.in);
		scan.nextLine();
	}
	
	void ring() {
		System.out.println(model+" can ring");
	}
	
	void playGames() {
		System.out.println(model+" can play games");
	}
	void setAlarms() {
		System.out.println(model+ " can set alarms");
	}
	void textMessages() {
		System.out.println(model+ " can send messages");
	}
	
}
