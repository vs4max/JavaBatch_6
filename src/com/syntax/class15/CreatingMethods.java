package com.syntax.class15;

public class CreatingMethods {
	
	// create a method that will accept marks (99,80)
	// based on the marks it will return grade (A,B,C..)
	// if grade > 90 --> A; 90 < grade > 80 --> B .....

	char getGrade(int a) {
		char grade;
		if (a>90) {
			grade = 'A';	
		}else if (a<=90 && a>80) {
			grade = 'B';	
		}else if (a<=80 && a>70) {
			grade = 'C';
		}else {
			grade = 'F';
	}
	
	return grade;
	}
public static void main(String[] args) {
	
	CreatingMethods obj = new CreatingMethods();
	char grade = obj.getGrade(85);
	System.out.println(grade);
	
	System.out.println(obj.getGrade(65)); //F
	
	//base on the grade A or B-->good job! ; otherwise -->study more
	
	if(grade=='A' || grade=='B') {
		System.out.println("Good job");
		
	}else {
		System.out.println("Please study more");
	}	
}
}
