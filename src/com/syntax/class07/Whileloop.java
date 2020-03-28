package com.syntax.class07;

public class Whileloop {

	public static void main(String[] args) {
		int time = 10;
		if (time < 12) {
			System.out.println("Good morning");

		}
		System.out.println("------- WHILE LOOP---------");

		while (time < 12) {
			System.out.println("Good morning");
			time++;
		}

		// from 1-50
		int num = 1;
		while (num <= 50) {
			System.out.println(num);
			num++;
		}
		System.out.println("______________");
		// PRINT NUBERS FROM 20-30
		int num1 = 20;
		while (num1 <= 30) {
			System.out.println(num1);
			num1++;
		}
		System.out.println("______________");
		// print from 10-1 in one line
		int num2 = 10;

		while (num2 >= 1) {
			System.out.print(num2);
			num2--;
		}
		System.out.println("***********");
		// PRINT ODDS NUMBERS FROM 1-20
// 1 way incrementing by 2 
		int num3 = 1;
		while (num3 < 20) {
			System.out.println(num3);
			num3 += 2;
		} 
		// 2 way
	
		int num4 = 2;
		while (num4 <= 20) {
			if (num4 % 2 != 0)
				System.out.println(num4);
		}
		num4++;

	}

}
