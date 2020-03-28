package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//widening happens implicitly
		double d=10;
		System.out.println(d); //10.0
		
	//	int i=10.99; --> compile time error saying:
	// type mismach , cannot convert double to int
		
		//narrowing, explicitly implementing
		int i=(int)10.99;
		System.out.println(i); // you will loss .99
		
		//byte -127 to 127
		byte b=(byte)1284;
		System.out.println(b); //you will "/" the number on 128 ?! 
		
		
		
		
	

	}

}