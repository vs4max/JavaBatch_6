package com.syntax.class15;

public class MethodsTest {
	public static void main(String[] args) {
		Methods word = new Methods();
 word.sayWelcome();
 word.sayAnything ("Hello", 3);	
  
 // word.sayAnything(10, "Hi"); --> CE : must be exactly the same as your method 
 
 word.isItRaining(false);
 word.isItRaining(true);
 
	}
}
