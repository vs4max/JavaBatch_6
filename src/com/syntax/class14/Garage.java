package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
	
		//building individual objects

	Car car1 =	new  Car();
	car1.make="Lamborghini";
	car1.model="Galardo";
	car1.year=2020;
	car1.color="blue";
	
	Car car2 = new Car();
	car2.make="BMW";
	car2.model="M5";
	car2.year=2019;
	car2.color="pink";
		
	Car car3 = new Car();
	// car3.make=123; если изначально поставила String нельзя писать как int
	car3.make="123";
	//  car3.speed = 200; нужно задать изначально такую функцию 
	
	//print BMW
	System.out.println(car2.make);
	
	//accessing behavior / method of Car with car 1
	car1.drive();
	car1.accelerate();
	car1.makeNoise();
	car1.stop();

	//accessing behavior / method of Car with car 2
	car2.drive();
	car2.accelerate();
	car2.makeNoise();
	car2.stop();
	
	// car2.breaking --> CE: method is not define in our class
	
	/*Car2 anotherCar = new Car2();
	anotherCar.make="Toyota";
	anotherCar.
	*/
	
	//Print I drive Pink Lmborghini
	System.out.println("I drive "+car2.color+" "+ car1.make);
	
	//create bike object
//	new Bike(); --> cannot create an onject if we do not have a class "Car"
	}

}
