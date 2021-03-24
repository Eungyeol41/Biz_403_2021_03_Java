package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNum = new int[20];
		int intSum = 0;

		for (int i = 0; i < 20; i++) {
			intNum[i] = rnd.nextInt(100) + 1;

		}
		System.out.println("============================");
		
		for (int i = 0; i < 20; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				
			}
		}
		for (int i = 0; i < 20; i++) {
			
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}	
		System.out.println("-----------------------------");
		System.out.println("짝수들의 합 : " + intSum);
		System.out.println("=============================");
	}
}
