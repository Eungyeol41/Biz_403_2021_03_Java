package com.callor.review;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intTotal = new int[5];
		float[] floatAvg = new float[5];
		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;
		
		System.out.println("==================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------");
		
		for(int i = 0; i < 5; i ++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
			
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
			
			intSum1 += intKor[i];
			intSum2 += intEng[i];
			intSum3 += intMath[i];
			
			System.out.printf("%d\t", i + 1);
			System.out.printf("%d\t", intKor[i]);
			System.out.printf("%d\t", intEng[i]);
			System.out.printf("%d\t", intMath[i]);
			System.out.printf("%d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("==================================================");
		System.out.print("총점\t");
		System.out.printf("%d\t%d\t%d\n", intSum1, intSum2, intSum3);
		System.out.println("==================================================");
		
	}
}
