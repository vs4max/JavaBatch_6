package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int [][]numbers = new int[3][4];

		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;

		//3 row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		
		//print value 15
		System.out.println(numbers[1][2]);
		
		
		int[][] nums= {//array of 3 single dimensional arrays
				{10,20,30,40},
				{5,10,15,20},
				{1,2,3,4}
		};
System.out.println(nums[2][3]);//4	
System.out.println(nums[0][2]);//30

//2x3		
String [][] months= {
		{"January", "February","December"},
		{"March","April","May"},
};
System.out.println("I was born on "+months[0][1]); //MAY calculate from 0,1- row 0,1,2-col.
		

String [][] month= {
		{"January", "February","December"},
		{"March","April"},
};
int rows=month.length; //how many arrays
int firstArray=month[1].length;
System.out.println(firstArray);



for(int i=0; i<month.length; i++) {
	for (int j=0; j<month[i].length; j++ ) {
	System.out.println(month[i][j]);	
	}
}

	}

}
