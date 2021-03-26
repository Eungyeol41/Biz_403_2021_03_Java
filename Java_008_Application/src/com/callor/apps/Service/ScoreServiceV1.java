package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV1 {

	Scanner scan = new Scanner(System.in);
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intTotal;
	float[] floatAvg;
	
	int lineLength = 50;
	
	public ScoreServiceV1() {
		
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}
	
	public void makeNums() {
		System.out.println("학생 5명의 국어 점수를 입력하세요");
		System.out.println(LinesService.sLines(lineLength));
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intKor[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("학생 5명의 영어 점수를 입력하세요");
		System.out.println(LinesService.sLines(lineLength));
		for(int i = 0; i < intEng.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intEng[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("학생 5명의 수학 점수를 입력하세요");
		System.out.println(LinesService.sLines(lineLength));
		for(int i = 0; i < intMath.length; i++) {
			System.out.printf("학생 %d >> ", i + 1);
			intMath[i] = scan.nextInt();
		}
		
	}
	
	public void printHeader() {
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.sLines(lineLength));
	}
	
	public void printList() {
		for(int i = 0; i < intKor.length; i++) {
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
		System.out.println(LinesService.dLines(lineLength));
		
		
	}
	
	
	
	
	
	
}
