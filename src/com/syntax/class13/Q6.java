package com.syntax.class13;

public class Q6 {

	public static void main(String[] args) {
		//Write a Java Program to find whether a String is palindrome or not?

		String str = "Kayak";
		
		//1st way
		char []charArray = str.toCharArray();
		
		String reverse ="";
		System.out.println(reverse.isEmpty());	
		
		for (int i=charArray.length -1; i>=0; i--) {
		reverse +=charArray[i];
	}
		System.out.println("word is = "+str);
System.out.println("reverse is = "+reverse);

if(str.equals(reverse)) {
	System.out.println("Yes, it is a palindrome");
}else {
	System.out.println("No, it is not a palindrome");
}
	}

}
