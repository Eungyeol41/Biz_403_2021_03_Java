package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intMembers = new int[5];
		int[] pizzaBox = new int[5];
		int pizzaPcs = 6;
		int intTotal = 0;
		
		
		for(int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(10) + 50;
			pizzaBox[i] = intMembers[i] / pizzaPcs;
			boolean bYes = intMembers[i] % (pizzaBox[i] * pizzaPcs) == 0;
			if(!bYes) {
				pizzaBox[i]++;
			}
			intTotal += pizzaBox[i];
		}
		System.out.println("===================================");
		System.out.printf("인원수\t피자주문\t전체\n");
		System.out.printf("%d\t %d\t %d\n",intMembers[0] , pizzaBox[0], pizzaBox[0] * pizzaPcs );
		System.out.printf("%d\t %d\t %d\n",intMembers[1] , pizzaBox[1], pizzaBox[1] * pizzaPcs );
		System.out.printf("%d\t %d\t %d\n",intMembers[2] , pizzaBox[2], pizzaBox[2] * pizzaPcs );
		System.out.printf("%d\t %d\t %d\n",intMembers[3] , pizzaBox[3], pizzaBox[3] * pizzaPcs );
		System.out.printf("%d\t %d\t %d\n",intMembers[4] , pizzaBox[4], pizzaBox[4] * pizzaPcs );
		System.out.println("====================================");
		System.out.printf("전체 주문 BOX 수량 : %d", intTotal);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
