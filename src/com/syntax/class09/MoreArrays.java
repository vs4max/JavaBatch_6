package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
//arrays are fixed in size
		//IF WE ADD MORE VALUES THEN WE DECLAED -->Array Index Out Of Bonds Exception
		
		String[] students = new String[4];
		students[0] = "Vika";
		students[1] = "Vladislav";
		students[2] = "Marina";
		students[3] = "Andrei";
		
		System.out.println(students[3]);
		
		System.out.println("_________NULL________");
		//if we store less elements than we declared 
		//compiler will add default values 
		String[] inClassStudents = new String[5];
		inClassStudents [0]="Alex";
		inClassStudents [1]="Ivan";
		System.out.println(inClassStudents[2]);
		
	}

}
