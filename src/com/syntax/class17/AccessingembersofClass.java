package com.syntax.class17;

public class AccessingembersofClass {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.name="Victoria";
	emp.lastName="Zhukova";
	emp.salary=100000;
	// emp.ssn=158769;  CE: field ssn is not visible

	Employee.method1();
	emp.method2();
	emp.method3();
	// emp.method4(); CE: method is not accessible
}
	
}
