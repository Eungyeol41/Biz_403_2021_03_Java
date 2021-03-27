package com.callor.apps.Service;

import java.util.Scanner;

public class ScoreServiceV1A {

	Scanner scan = new Scanner(System.in);

	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;

	int lineLength = 50;

	public ScoreServiceV1A() {

		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
	}

	public void makeNums() {
		System.out.println(LinesService.dLines(lineLength));
		for (int i = 0; i < 5; i++) {
			System.out.printf("학생 %d의 국어, 영어, 수학 점수를 입력하세요\n", i + 1);

			System.out.println(LinesService.sLines(lineLength));

			System.out.printf("국어 >> ");
			intKor[i] = scan.nextInt();

			System.out.printf("영어 >> ");
			intEng[i] = scan.nextInt();

			System.out.printf("수학 >> ");
			intMath[i] = scan.nextInt();

			System.out.println(LinesService.sLines(lineLength));
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
