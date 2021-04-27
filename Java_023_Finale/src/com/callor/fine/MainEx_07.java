package com.callor.fine;

public class MainEx_07 {

	/*
	 * =====================================
	 * 5단 구구단
	 * ------------------------------------
	 * 5  x  1 = 5
	 * 5  x  2 = 5
	 * 5  x  3 = 5
	 * 5  x  4 = 5
	 * 5  x  5 = 5
	 * 5  x  6 = 5
	 * 5  x  7 = 5
	 * 5  x  8 = 5
	 * 5  x  9 = 5
	 * =====================================
	 */
	
	public static void main(String[] args) {
		
		int intDan = 5;
		int intNum = 1;
		
		System.out.println("=====================");
		System.out.printf("%d 구구단\n", intDan);
		System.out.println("--------------------");
		
		intNum ++;
		System.out.printf("%d x %d = %d\n", intDan, intNum, intDan * intNum);
		
		System.out.println("========================================================");
		
		
		System.out.println("5단 구구단");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", 5, i, 5 * i);
		}
		
		System.out.println("==-=-=-=-=--=-=-=-==");
		int dan = 5;
		System.out.println(dan + "단 구구단");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
	}
	
		
		
	

}
