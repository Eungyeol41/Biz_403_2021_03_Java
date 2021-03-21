package com.callor.controller;

public class Score_04A {

	public static void main(String[] args) {
	
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		int intSum = 0;
		float floatAvg = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		floatAvg = (float)intSum / 3;
		
		System.out.println("------------------------");
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("------------------");
		System.out.printf("총점 : %d\t 평균 : %2.2f\n", intSum, floatAvg);
		System.out.println("========================");
			
		
	}
	
	
}
