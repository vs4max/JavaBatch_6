package com.syntax.class10;

public class Recab {
public static void main(String [] args) {
	
	int[] grades= new int[4];
	grades[0]=90;
	grades[1]=67;
	grades[2]=89;
	grades[3]=78;
	
	//what is average???
	
	int average = (grades[0]+grades[1]+grades[2]+grades[3])/4;
	System.out.println("Average grade is "+average);
	
	System.out.println(" _______CREATING AN ARRAY OF CITIES_________");
	
	String[]cities= {"Washington DC","NY","Paris","Moskow","Maiami","LA"};
	
//I live in Paris
	System.out.println("I live in "+cities[2]);
	
	System.out.println("_________");
	int x=2;
	System.out.println(cities[x]);
	
	x+=3;
	System.out.println("I moved to "+cities[x]);
	
	//how many elements stored inside my array

	int arraySize=cities.length;
	System.out.println("Total elements "+arraySize);
	
	//How can we access last element from array??
	System.out.println(cities[arraySize-1]);
	
	//access all elements from an array
 for(int i=0; i<arraySize; i++) {
	 System.out.println(cities[i]);
 }	
}
}
