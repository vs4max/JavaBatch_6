package com.syntax.class14;

public class ClassDog {
	
	String breed;
	String color;
	String name;
	int age;
	
	public static void main(String[] args) {
		 
		//create a dog
		
ClassDog dog = new ClassDog(); // --> create 1st object
dog.breed="Gernan";
dog.color="braun";
dog.name="Bobik";
dog.age=10;

dog.eat();
dog.bark();
dog.run();

// 2nd dog 
ClassDog dog1 = new ClassDog(); // --> create 2nd object
dog1.breed="Doberman";
dog1.color="black";
dog1.name="Parlament";
dog1.age=3;

dog1.eat();
dog1.bark();

	}

	//define behavior
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+ " can bark");
	}
	void run() {
		System.out.println(name+ " can run");
	}	
}
