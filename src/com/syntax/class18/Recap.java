package com.syntax.class18;

public class Recap {
	
	/*
	 * Create a method that will accept an array as parameters and will return a sum of all elements from that array.
	 *  Method should be visibly only within same package and accessible by the creating an instance of the class.
	 */

	protected int sumFromArray (int[] array) {
		int total = 0;
		for ( int i =0; i<array.length; i++) {
			total +=array[i];
		}
		return total;
	}
	public static void main(String[] args) {
		Recap obj = new Recap();
		int [] array = {2, 7, 19, 857};
		System.out.println("Total: "+obj.sumFromArray(array));
	}
	
}
