package com.syntax.class17;

public class StaticKeyWordTest {

	public static void main(String[] args) {

		// access static members of another class
		
		StaticKeyWord.brand = "Android";
		StaticKeyWord.touchScreen = true;
		StaticKeyWord.displayGeneralInformation();

		// access instance members of another class
		
		StaticKeyWord sk = new StaticKeyWord();
		sk.color = "red";
		sk.memory = 128;
		sk.displaySpecification();

		StaticKeyWord sk1 = new StaticKeyWord();
		sk1.color = "blue";
		sk1.memory = 512;
		sk1.displaySpecification();

		StaticKeyWord sk2 = new StaticKeyWord();
		sk2.color = "black";
		sk2.memory = 64;
		sk2.brand="nokia";
		
		//NOT THE RIGTH WAY TO ACCESS 
		sk.displayGeneralInformation();
		sk1.displayGeneralInformation();
		sk2.displayGeneralInformation();

		
		
	}
}
