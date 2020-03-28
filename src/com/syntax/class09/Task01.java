package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		
	 for(int i=1; i<=3; i++) {
	for(int j=1; j<=3; j++) {
		System.out.println(i+" "+j);
	}
	}
// military time 
	 
	 for (int i=0; i<=23; i++) {
		 for (int x=0; x<=59; x++) {
			 if(x<10) {
				 System.out.println(i+" : 0"+x);
			 }else
			 System.out.println(i+" : "+x);
			 
		 }
	 }
	 for (int i=0; i<=9; i++) {
		 for (int x=0; x<=9; x++) {
			 for (int a=0; i<=9; i++) {
				 for (int b=0; x<=9; x++) {
					 System.out.println(i+" "+x+" "+a+" "+b);
				 }
		 }
	 
		 }}
	 
	}

}
