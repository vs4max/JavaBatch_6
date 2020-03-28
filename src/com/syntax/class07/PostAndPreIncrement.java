package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		
		//++, --
		// preincrement ++y, postincrement y++
		int z;
		int y = 10;
		z=y++; //postincrement = first use the variable and then increment
		System.out.println(z);
		System.out.println("___________");
		int w;
		int x = 10;
		w=++x; // first increment and then use it and assign it
		System.out.println(w);	
		System.out.println("___________");
		int num =1;
		while(num<5) {
			System.out.println(++num);
		}
		System.out.println("___________");
		int num2= 1;
		while (num2<5) {
			System.out.println(num2  ++);
		}
	}
	

}
