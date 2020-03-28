package com.syntax.class11;

public class TaskInClass02 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 * 
		 */
		String[][] countries = { { "USA", "Canada", "Mexico" }, { "Chile", "Argentina", "Brazil" },
				{ "Ilally", "German", "Greate Brittan" }, { "Zair", "Chad", "Zimbabwe" } };
		int total = 0;
		for (int i = 0; i < countries.length; i++) {
			for (int c = 0; c < countries[i].length; c++) {
				System.out.print(countries[i][c] + " ");
				total++; /*
							 * это простой калькулятор одной единичке. у тебя получается в твоем цикле фор
							 * эта единичка будет сама к себе прибавляться, каждый раз, когда начинается
							 * новый круг цикла, ну а кругов в цикле у тебя ровно столько сколько элементов
							 * в этом массиве, вот и получается, что твой вложенный цикл пройдется по всему
							 * массиву и каждый раз когда он будет работать с очередным значение/переменной
							 * массива - он будет прибавлять единичку, вот и получится сумма твоих стран).
							 * 12:00 nt sum=0;(изначально это 0) for(int i=0;i<x.length;i++) { <--- здесь ты
							 * заходишь в первую строку массива, а потом будешь заходить в каждую следующую.
							 * for(int y=0;y<x[i].length;y++) { <----- здесь ты заходишь в каждый столбец
							 * или как я говорю - в каждую ячейку данной строки, данного маленького массива
							 * который является определенной строкой нашего большого массива.
							 * System.out.print(x[i][y]+” “); sum++; <--- а вот здесь ты прибавляешь
							 * еденичку к тому нулю, каждый раз когда вот именно этот фор, заходит в
							 * очередную ячейку. }
							 *
							 */
			}
			System.out.println();
		}
		System.out.println("Total " + total);
		System.out.println("__________________________________________");
		int count = 0;
		for (String[] nameOfCountries : countries) {
			for (String world : nameOfCountries) {
				System.out.print(world + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("TOTA 2nd way " + count);

	}
}
