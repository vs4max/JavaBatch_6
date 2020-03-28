package com.syntax.class14;

public class MethodExamples {

	// want to create a method that will be greeting a person

	void greet() {
		System.out.println("Hello Sarmed");
	}
	void greet1(String name) { // установленный параметр 
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {

		// how do I call method greed?? --> first we need to create on Objects of the Class
		//where that method belongs

		// className variableName = new ClassName();
		MethodExamples object1 = new MethodExamples();
		System.out.println("_______MAIN greet()________");
		object1.greet();
		System.out.println("_______MAIN greet1()________");
		object1.greet1("Alexa");
		object1.greet1("Richard");
		object1.greet1("Cecillia");
		object1.greet1("John");
	}

}
