package com.syntax.class08;

public class USEFULCODES {

	public static void main(String[] args) {
		//  to print number from 50 to 1
		

		for(int i=50; i>=1; i--) {
		System.out.println(i);
		}	
		System.out.println("________________");
		//print odd numbers between 20-50
		
		for(int i=20; i<=50; i++) {
			if (i%2!=0) {
			System.out.println(i);
			System.out.println("________________");
		}}
		//or  
		for (int i= 21; i<=50; i+=2) {
			System.out.println(i);
		}
		System.out.println("________________");
		//what is out put
		
		int total =2;
		for (int k=1; k<4; k++) {
			total=total*k;
		}
		System.out.println(total);
		
		//write a program to calculate sum odds numbers and sum of even numbers 1-99
		System.out.println("________________");

	int evenSum = 0;
	int oddSum = 0;
	
	for ( int x=1; x<=99; x++) {
		 if (x%2!=0) {
		evenSum = evenSum+x;
		 }else {
			 oddSum= oddSum+x;
	
		}}
	System.out.println(evenSum);
		System.out.println(oddSum);
		
		System.out.println("__________");
		 //multiplication table
		
		int num= 4;
		for (int i=1;i<=10; i++) {
		System.out.println(num+ " * "+i+" = "+i*num);
		}
		
		
	}	
}				
	


