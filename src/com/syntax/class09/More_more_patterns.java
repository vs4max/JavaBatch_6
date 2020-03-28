package com.syntax.class09;

public class More_more_patterns {

	public static void main(String[] args) {
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
 for (int r=1; r<=4; r++) {
	 for (int c=1; c<=r; c++) {
		 System.out.print("*");
	 }System.out.println();
 }
 System.out.println("_____________");
 /*
  * 1
  * 12
  * 123
  * 1234
  * 12345
  * 
  * r=5
  * c<=r
  */
 for (int r=1; r<=5; r++) {
	 for (int c=1; c<=r; c++) {
		 System.out.print(c);
	 }System.out.println();
 }
		
	}

}
