package com.syntax.class15;

public class MethodsReturnValue {

	public static void main(String[] args) {

		// create a String and based on the length of the String
		// we define whether String is short or long

		String str = "Hello my friends";
		int length = str.length();

		if (length > 10) {
			System.out.println("String is long");
		} else {
			System.out.println("String is short");
		}

		// compare two numbers --> we will identify largest number if even or odd

		// Task obg = new Task();
		// int num = obg.largerNumber(10,20); CE : since is Larger does not return any
		// value
		MethodsReturnValue newObject = new MethodsReturnValue();
		int num = newObject.largest(12, 13);
		boolean flag = newObject.isOdd(num);
		System.out.println("Largest number is "+num+ " is odd number : "+flag);
		
	}

	// create a method that returns largest number from given numbers

	int largest(int a, int b) {
		int largest;

		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

	boolean isOdd(int num) {
		boolean isOdd;

		if (num % 2 == 0) {
			isOdd = false;
		} else {
			isOdd = true;
		}
		return isOdd;
	}

	
}
