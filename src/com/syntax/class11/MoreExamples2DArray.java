package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		// lets create 2D array in which we store professions 

		String [][]professions = {
				{"QA testers", "Developers","Scrum Master","Product Ouner"},
				{"Math teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"}
		};
		//get elements using advanced for loop
		
		for(String [] occupation:professions) {// почему одни скобочки не 2
			for (String title:occupation) {
			System.out.println();
			
		}
		System.out.println();
		}	
	}

}
