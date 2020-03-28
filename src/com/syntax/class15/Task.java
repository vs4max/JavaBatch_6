package com.syntax.class15;

public class Task {
	/*
	 * 1. Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 * 
	 * 2. Create a method that will take a number and prints whether the number is
	 * even or odd.
	 * 
	 * 3. Create a method that will print whether given String is palindrome or not.
	 * 
	 * 4. Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed.
	 */

	// Task1

	void largerNumber(int a, int b) {
		if (a > b) {
			System.out.println(a+" is the Largerest number than "+b);
		} else {
			System.out.println(b+" is the Largerest number than "+a);
		}
	}

	public static void main(String[] args) {

		Task num = new Task();
		num.largerNumber(2, 25);

	}

	// Task 2
	void evenORodd(int a, int b) {
		
		if  (a % 2 == 0)  {
			System.out.println(a + " is odd number");
		} else if (b % 2 == 0) {
			System.out.println(b+ " is even number");
		}if (!(a % 2 == 0)) {
			System.out.println(a+ " is even number");
		}else if (!(b % 2 == 0)) {
			System.out.println(b+ " is even number");
		}
	}
	// Task 3
	
	void palindrome(String word) {
	char []array = word.toCharArray();
	String reverse ="";
	for (int i = array.length-1; i>=0; i--){
	reverse+=array[i];	
	}
	if (reverse.equalsIgnoreCase(word)) {
		System.out.println("Word is palindrome");
	}else {
		System.out.println("Word is not palindrome");
	}
	}	
	
	//Task4
	
}
