package com.syntax.class11;

public class TaskInClass {

	public static void main(String[] args) {
		/*
		 * Create an array of cars : american, german, korean, italian.
		 *  Then retrieve all values from that array using 2 different loops
		 */
 String [][] cars= {
		 {"Jeep","Ford","Doodge"},
		 {"Mercedes","BMW","Audy"},
		 {"Kea","Toyta","Honda"},
		 {"Ferrary","Lambrogrini","Maserati"}
 };
 
 for(int i =0; i<cars.length; i++) {
	 for(int c=0; c<cars[i].length; c++) {
		 System.out.print(cars[i][c]+" ");
	 }
 }
 System.out.println("__________WAY 2___________");
 for(String [] models :cars) {
	 for(String nameOfCars:models) {
		 System.out.println(nameOfCars);
	 }
 }
 
	}

}
