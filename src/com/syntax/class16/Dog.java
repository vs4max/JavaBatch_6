package com.syntax.class16;

public class Dog {
    //instance variables 
	String name, size;
	int age;
	
	// static variables
	static String breed ="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	void dispalyDog() {
		System.out.println("Dog name is "+name+ " and is "+size+ " dog and age is "+age);
		System.out.println("Dog breed is "+breed+" and it has "+paws+" paws and "+tail+" tail");
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		//how to access instance variables? --> by creating an object and using reference variable
		dog1.name = "Lucy";
		dog1.size = "big";
		dog1.age = 5;
		dog1.age = 6;
dog1.dispalyDog();;

		// how to access static variables? --> static variables belong to the class --> accessed by classname

System.out.println(Dog.breed);
System.out.println(Dog .paws);
System.out.println(dog1.breed);// access static variable in static way
System.out.println(Dog .breed);

//changing value of static variable
breed="Buldog";

		Dog dog2 = new Dog();
		dog2.name = "Sharik";
		dog2.size = "puppy";
		dog2.age = 1;
dog2.dispalyDog(); 


		Dog dog3 = new Dog();
		dog3.name = "Pepsy";
		dog3.size = "newborn";
		dog3.age = 2;
dog3.dispalyDog();
		

	}

}
