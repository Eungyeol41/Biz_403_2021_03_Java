package com.callor.review;

import java.util.Random;

public class App_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intScores = new int[10];
		int intSum = 0;
		float floatAvg = 0;
		
		for(int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
			intSum += intScores[i];
			floatAvg = (float)intSum / 10;
		}
		System.out.println("==============================");
		System.out.printf("총점 : %d\t평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("==============================");
		
	}

	
	
}
