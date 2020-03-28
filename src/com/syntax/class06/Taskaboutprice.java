package com.syntax.class06;

import java.util.Scanner;

public class Taskaboutprice {
	public static void main(String[] args) {
		
		/*
		 * write a program to ask user if there is sale 
		 * is No sale --> not shopping
		 * if sale we will ask a price of the item
		 * based on price we will apply discount and calculate that price
		 * 
		 * if price of the item < 20 --apply 10%
		 * if price between 20 and 100--> apply 20%
		 * if price between 100 and 500--> apply 30%
		 * if price more 500 --> apply 50%
		 * 
		 * After discount ___the price of the item reduced from___to___
		 */
		

String sale;
double price;
double discount;
double finalPrice;

Scanner scan = new Scanner (System.in);
System.out.println("Do we have a sale?? ");
sale = scan.nextLine();

if(sale.equalsIgnoreCase("yes")) {
	System.out.println("What is the price???");
price = scan.nextDouble();

if (price<20) {
	discount = price*0.1;
}else if (price>=20 && price<100) {
	discount = price*0.2;
}else if (price>=100 && price<500) {	
	discount = price*0.3;
}else  {
	discount =price*0.5;
}
finalPrice=price - discount;

System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);	

}else {
	System.out.println("No sopping today");
} 
	}
}
