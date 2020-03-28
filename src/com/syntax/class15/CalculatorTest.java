package com.syntax.class15;

public class CalculatorTest {
	
public static void main(String[] args) {
	

	Calculator cal = new Calculator();
	cal.add(100,200);
	cal.sub(1000,200);
	
	// cal.add(200); should be 2 parameters
	// cal.add(20.3, 19.5) // --> CE : should be the same as your method parameter 
	cal.add(150,35);
	cal.sub(10,3);
	
	cal.mult(20, 10);
	cal.div(20, 10);
}	

}
