package com.syntax.class11;

public class Repl {

	public static void main(String[] args) {
		// 
 String [][] groceries= {
		 {"cucumber","potato","carot" },
		 {"mango","apple","banana","kiwi" },
		 {"milk","cheese","yogurt"}
			 
		 };
 System.out.println(groceries[1][2]);
 System.out.println();
 System.out.println("_____get all values from 2D______");
 System.out.println();
 
 //get all values from 2D
 //loop through columns
 
  for(int i=0; i<groceries.length; i++) { //почему тут такое написание и 0 она писала 0
 for (int c=0; c<groceries[i].length; c++) { //groceries.length will go through your rows, groceries[r].length will go through your columns
	 System.out.println(groceries[i][c]);
 }
 System.out.println();
  }
 
 System.out.println("____GETTING ELEMENTS USING ADVANCED FOR LOOP_____");
 // LOOP THROUG ALL AARAY
  for(String[] array:groceries) {
	  //LOOP THROUG EACH SINGLE ARRAY
	  for(String items:array){ //почеу тут нет квадратных скобок??? ПОЙМИ ЭТО!!!!!! 
		  System.out.println(items+ " ");
	  }
	  System.out.println();
  }
 
  
  
  
  
  
  
  
	}
		
	}


