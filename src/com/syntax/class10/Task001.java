package com.syntax.class10;

public class Task001 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array.
		 * 
		 * 
		 * Create an array on integers and calculate the sum of all integer elements in
		 * an array.
		 * 
		 * 
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */
		
		String[] ani= {"Leo", "Monkey","Cat","Dog", "Bull","Mouse"};
		for(int i=0; i<ani.length; i++) {
			System.out.print(ani[i]+" ");
		}
		
		for (String animals:ani) { 
			System.out.println (animals.length()+" ");
		}
		System.out.println("__TASK002__");
		
		int[] numbers= {2,4,6,8,9};
		int sum=0;
		for (int i:numbers) {
			sum+=i;
		System.out.println(sum);
		}
		
		System.out.println("____TASK003____");
		
		String [] coun = new String[4];
			
		coun[0]="Russia";
		coun[1]="France";
		coun[2]="China";
		coun[3]="Canada";
		for (String con:coun) {
			
			if(coun.equals("Russia")) {
				System.out.println("The capital of "+coun[0]+" Moscow");
			}if (coun.equals("France")) {
				System.out.println("The capital of "+coun[1]+" Paris");
			}if (coun.equals("China")) {
				System.out.println("The capital of "+coun[2]+" Beijing");
			}if (coun.equals("Canada")) {
				System.out.println("The capital of "+coun[3]+" Ottava");
			}
		}
		}
	}



