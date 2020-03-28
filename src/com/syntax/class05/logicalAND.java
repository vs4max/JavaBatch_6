package com.syntax.class05;

public class logicalAND {

	public static void main(String[] args) {
		/* 
		 *  If declare number is
		 *  between 1-10 ==> this number is small
		 *  between 11-100==> this is big number
		 *  between 101-1000==> this is large number
		 */

		// AND - && - should be both conditions TRUE --> other will be FALSE
		// OR - || - should be one condition true --> others will be FALSE
		int num = 78;
		if (num>=1 && num<=100 ) {
			System.out.println("This number is small");
		}else if (num> 10 && num<=100) {
			System.out.println("This is a big number");
		}else if (num>101 && num<= 1000) {
			System.out.println("This is large number");
		}else {
			System.out.println("This is super large number");
		}
	
	}

}
