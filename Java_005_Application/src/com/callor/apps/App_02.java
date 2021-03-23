package com.callor.apps;

import java.util.Random;

public class App_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intMembers = new int[5];
		
		// intMembers의 0번째 배열에...
		// 난수를 만들어 저장하라
		intMembers[0]  = rnd.nextInt(26) + 25;
		intMembers[1]  = rnd.nextInt(26) + 25;
		intMembers[2]  = rnd.nextInt(26) + 25;
		intMembers[3]  = rnd.nextInt(26) + 25;
		intMembers[4]  = rnd.nextInt(26) + 25;
		
		// 배열의 개수가 5개이므로
		//첨자의 최대값은 4까지이다.
		// 첨자의 최대값 = 배열의 개수 -1
		intMembers[4]  = rnd.nextInt(26) + 25;
		intMembers[4] = 0; // 위 쪽 코드는 사라지게 됨.
		
		for(int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(26) + 25;
		}
		
		for(int i = 0; i < 5 ; i++) {
			//System.out.println("인원 수 : " + intMembers[i]);
			System.out.printf("%d반 인원수 : %d\n", i + 1, intMembers[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			
			int pizzaBox = intMembers[i] / 6;
			if(intMembers[i] % (pizzaBox * 6) > 0) {
				pizzaBox++;
			}
			System.out.printf("%d 인원수 : %d, 피자주문 : %d\n", (i + 1), intMembers[i], pizzaBox);
		}
		
		
		
		
		
		
		
	}
}
