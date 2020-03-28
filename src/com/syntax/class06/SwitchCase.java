package com.syntax.class06;
public class SwitchCase {
public static void main(String [] args) {
	
	int day = 58;
	String dayName;
	
	if (day==1) {
		dayName="Monday";
	}else if (day==2) {
		dayName="Tuesday";
	}else if (day==3) {
		dayName="Wednesday";
	}else if (day==4) {
		dayName="Thuesday";
	}else if (day==5) {
		dayName="Fiday";
	}else if (day==6) {
		dayName="Sutarday";
	}else if (day==7) {
		dayName="Sunday";
	}else {
		dayName="Invalid day";
	}
	
	System.out.println("Today is "+dayName);
	System.out.println("____________USING SWITCH__________");
	
	String today;
	switch (day) { //WORKS ONLY WITH : byte,short,char,int and String 
	// NOT (&& || !) OR (< <= > >=)
	case 1:
		today = "Monday";
		break;
	case 2:
		today = "Tuesday";
		break;
	case 3:
		today = "Wednesday";
		break;
	case 4:
		today = "Thuesday";
		break;
	case 5:
		today = "Friday";
		break;
	case 6:
		today = "Sutarday";
		break;
	case 7:
		today = "Sunday";
		break;
	default:
		today = "Invalid";
	}
	System.out.println("Today is "+today);	
}
}	