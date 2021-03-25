package com.callor.apps.service.EvenServiceV1;

import java.util.Random;

public class ScoreServiceV1 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	
	public ScoreServiceV1() {
		
		intKor = new int[10];
		intEng = new int[10];
		intMath = new int[10];
		
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}
	
	public void makeNums() {
		Random rnd = new Random();
		for(int i = 0; i < 10; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			
		}
		
	}
	
	public void printEven() {
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
	}
	
	public void sumPrint() {
		intTotal = new int[10];
		floatAvg = new float[10];
		for(int i = 0; i < 10; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
			
			System.out.printf("%d\t", i+1);
			System.out.printf("%d\t", intKor[i]);
			System.out.printf("%d\t", intEng[i]);
			System.out.printf("%d\t", intMath[i]);
			System.out.printf("%d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("===============================================");
	}
	
}
