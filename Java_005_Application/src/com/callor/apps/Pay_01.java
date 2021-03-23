package com.callor.apps;

public class Pay_01 {

	public static void main(String[] args) {
		
		int money = 0;
		money = 3723560;
		
		System.out.println("==========================");
		System.out.println("급여수령액 : 3,723,560");
		System.out.println("==========================");
		
		int won = 0;
		won = money / 50000;
		money = money % 50000;
		System.out.printf("50,000원권\t%2d매\n", won);
		
		won = money / 10000;
		money = money % 10000;
		System.out.printf("10,000원권\t%2d매\n", won);
		
		won = money / 5000;
		money = money % 5000;
		System.out.printf("5,000원권\t%2d매\n", won);
		
		won = money / 1000;
		money = money % 1000;
		System.out.printf("1,000원권\t%2d매\n", won);
		
		won = money / 500;
		money = money % 500;
		System.out.printf("500원권\t%2d매\n", won);
		
		won = money / 100;
		money = money % 100;
		System.out.printf("100원권\t%2d매\n", won);
		
		won = money / 50;
		money = money % 50;
		System.out.printf("50원권\t%2d매\n", won);
		
		won = money / 10;
		money = money % 10;
		System.out.printf("10원권\t%2d매\n", won);
		
		System.out.println("==========================");
	}
		

	
}
