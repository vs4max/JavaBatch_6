package com.syntax.class07;

public class TaskBoolean {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and assign it to 1

As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
		 */
boolean wd = true;
int day = 1;

while (wd) {
	if (day<6) {
	System.out.println("I need day off ");
}else {
	System.out.println("I do not need day off any more");
	wd = false; //WHY HERE ????
} 
	day++;
	}

System.out.println("________VLAD______");

int day1=1;
while(day1<7) {
	if(day1<6) {
		System.out.println("I need day off");
	} else {
		System.out.println("I dont need a day off");
	}
	day1++;
}


	}
}
