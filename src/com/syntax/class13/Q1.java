package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 */

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 30-20=10
		a = a - b;

		System.out.println("The value of a = " + a);
		System.out.println("The value of b = " + b);
		
		String str1="Day";
		String str2="Night";
		
		str1=str1+str2; //DayNight or concat()
		str2=str1.substring(0,3); //Day
		str1=str1.substring(3); //Night
		
		System.out.println("The value of str1 = "+str1);      //почему местами поменялось
		System.out.println("The value of str2 = "+str2);
		
		//another way
		
		String s1="Hello";
		String s2="Bye";
		
		String shorterstr1 = s1+s2; //DayNight or concat()
		s2 = shorterstr1.replace(s2, "");
		s1 = shorterstr1.replace(s2, "");

		System.out.println("The value of s1 = "+s1);
		System.out.println("The value of s2 = "+s2);
		
		
		
		
		
		
		
	}

}
