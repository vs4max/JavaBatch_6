package com.syntax.class13;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse String? character by character
		 * Reverse a string word by word?
		 */

		String given="I love Java";
		String reversed="";
		
		for(int i=given.length()-1; i>=0;i--) {     // что блять за -1????
			reversed=reversed+given.charAt(i);	
			}
		System.out.println("Reversed String = "+reversed);
		
		String [] array = given.split(" ");  //Я НЕ ПОНЯЛА 
		String reverseWords="";
		
		for(int i=array.length-1; i>=0; i--) {
		reverseWords=reverseWords+array[i] +" ";
		}
		System.out.println("Reverse a string word by word : "+reverseWords);
	}

}
