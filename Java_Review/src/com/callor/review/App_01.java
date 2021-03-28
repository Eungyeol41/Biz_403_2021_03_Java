package com.callor.review;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intMembers = rnd.nextInt(26) + 25;
		int pizzaPcs = 6;
		int pizzaBox = intMembers / pizzaPcs;
		
		if(intMembers % pizzaPcs == 0) {
			System.out.println("주문할 피자 판 수 : " + pizzaBox);
		} else {
			System.out.println("주문할 피자 판 수 : " + pizzaBox++);
		}
		
		System.out.println("랜덤 수|피자 판 수|총 피자 조각 수");
		System.out.println("========================================================");
		System.out.printf("%d\t%d\t%d\n", intMembers, pizzaBox, pizzaBox * pizzaPcs);
		
		
		
	}
}
