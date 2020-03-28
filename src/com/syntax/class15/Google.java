package com.syntax.class15;

public class Google {

	// define features such as id, name, last name,salary, title
	// define a behavior working, meetings, get paid

	int empId;
	double salary;
	String name, lastName, title;

	void working() // method header
	{ // method body
		System.out.println(title + " is working");
	}

	void getPaid() {
		System.out.println(empId + " is getting paid " + salary);
	}

	void meetings() {
		System.out.println(name + " attending meeting");
	}

	public static void main(String[] args) {
		// creating a first object
		Google emp1 = new Google();
		emp1.empId = 123;
		emp1.salary = 20000;
		emp1.name = "John";
		emp1.lastName = "Smith";
		emp1.title = "CEO";

		emp1.working();
		emp1.getPaid();
		emp1.meetings();

		// creating a second object
		Google emp2 = new Google();

		emp2.empId = 045;
		emp2.salary = 100000;
		emp2.name = "Mark";
		emp2.lastName = "Highner";
		emp2.title = "QA engeneer";

		emp2.working();
		emp2.getPaid();
		emp2.meetings();
//  emp2.playing(); --> CE : define playing did not find
	}

}
