package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		
		int[] intSum = new int [5];
		float[] floatAvg = new float [5];
		
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
			
			totalKor += intKor[i];
			totalEng += intEng[i];
			totalMath += intMath[i];
			
		}
		
		
		for(int i = 0; i < 5; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			
			floatAvg[i] = (float)intSum[i] / 3;
			
			total += intSum[i];
		}
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");

		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1)+ "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i]+ "\t");
			System.out.print(intMath[i]+ "\t");
			System.out.print(intSum[i]+ "\t");
			System.out.printf("%3.2f\t\n", floatAvg[i]);
		}
		System.out.println("===============================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d", totalKor, totalEng, totalMath, total);
	}
}
