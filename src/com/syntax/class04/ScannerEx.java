package com.syntax.class04;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		//Capture name from a user and
		//print the format
		//My name is _________
		
		//1. Bring Scanner class into program
		//System.in -->identifies keyboard
		
		Scanner scan= new Scanner (System.in);
		//Instruct user of what program expects
		System.out.println("Pls print your name");
		//capture line of Strings from a user
		String name = scan.nextLine();
		System.out.println("My name is "+name);
		//Instruct user of what program expects
		
		System.out.println("How old are you");
		//capture number from a user
		int age = scan.nextInt();
		System.out.print("Your name is "+name+" You age is "+age);
		
	

}
