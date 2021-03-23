package com.callor.apps;

import java.util.Random;

public class App_01A {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		/*
		 * 25 ~ 50명 인원이 있는 각 반에 pizza 간식을 지급하려고 한다.
		 * 각 반의 학생들에게 pizza 1조각씩 지급하려고 한다.
		 * 학생 수보다 부족하거나 1박스(6조각) 이상 남지 않도록 pizza를 주문해야 한다
		 * 이 때 pizza는 몇 박스가 필요할까? 
		 */
		rnd.nextInt(); // (-2)^31 ~ 2^31 -1 범위 내에 있는 수
		rnd.nextInt(10); // 0 ~ (10 -1), +1 (1 ~ 10)
		
		//피자 조각 수
		int pizzaPcs = 6;
		
		//25 ~ 50의 수 중 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25;
		
		int pizzaBox = 0;
		// 정수 / 정수 ==> 몫이 몇 개?
		// 필요한 box 수와 같거나 1 작은 값이 만들어진다.
		pizzaBox = intMembers / pizzaPcs;
		
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;
		
		//if(bYes == false) {
		if(!bYes) {
			pizzaBox++;
		}
		
		System.out.println("=====================================");
		System.out.println("인원 수 : "+ intMembers);
		System.out.println("피자 판 수 : " + pizzaBox);
		System.out.println("전체 조각 : " + pizzaBox * pizzaPcs);
		System.out.println("=====================================");
		
		
		
		
	}
}
