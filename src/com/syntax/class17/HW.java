package com.syntax.class17;

public class HW {

	/*
	 * Create a method that will accept an array as parameters and will return a sum
	 * of all elements from that array. Method should be visibly only within same
	 * package and accessible by the creating an instance of the class. 
	 * 
	 * Create a method that will take a String as a parameter and returns reverse String.
	 * Method should be available to all classes within your projects and accessible
	 * by class name.
	 * 
	 * Create a method that will accept a String as a parameter and
	 * return a new String that consist only of vowels. Method should be available
	 * inside the class where it was declared and executed by calling it is name.
	 * 
	 */

	/*
	 * // Task-1
	/*Create a method that will accept an array as parameters and will return a sum
	 * of all elements from that array. Method should be visibly only within same
	 * package and accessible by the creating an instance of the class.
 	 */
	static int array(int [] x) {
		int sum=0;
		for (int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		ClassTask task1=new ClassTask();
		int[] y= {10,12,13,15};
		int arr=task1.array(y);
		System.out.println("Sum of all array element is: "+arr);
	}
}
	 */
	
}
