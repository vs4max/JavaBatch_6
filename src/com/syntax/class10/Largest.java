package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		//largest number
		int []nums= {200, 30, -1, 900, 56, 787};
		
		int max = nums[0];
		for(int i = 0; i < nums.length; i++){
		    if(max<nums[i])
		        max = nums[i];
		}

		System.out.println(max);
		
		
		
		
	}

}
