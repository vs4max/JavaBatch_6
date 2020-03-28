package com.syntax.class09;

public class Task_Class {

	public static void main(String[] args) {
		/*
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */
		for (int r=5; r>=1; r--) {
			 for (int c=1; c<=r; c++) {
				 System.out.print(r);
			 }System.out.println();
		 }
		System.out.println("_______________");
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int r=1; r<=5; r++) {
			 for (int c=1; c<=r; c++) {
			 System.out.print("*"+" ");
		}
			 System.out.println();
		}
				 for (int r=4; r>=1; r--) {
				 for (int c=1; c<=r; c++) {
						 System.out.print("*"+" ");
					 }System.out.println();
			 }
	}

}
