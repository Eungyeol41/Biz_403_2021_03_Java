package com.callor.controller;

/*
 * printf() 사용하여 출력할 때
 * %d : 정수(십진수)
 * %f : 실수(float)
 * 		%3.2f : 소수점이하 2번째자리까지 표시
 * %s : 문자열
 * \n : Enter를 누른 것처럼 줄바꿈 실행
 * \t : Tab
 */
public class Score_01A {
	
	public static void main(String[] args) {
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		intKor = 80;
		intEng = 77;
		intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		intAvg = intSum / 3;
		
		System.out.println("========================");
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		
		System.out.println("------------------------");
		System.out.printf("총점 : %d\t평균 : %d", intSum, intAvg);
		
		System.out.println("========================");
		
		
		
	}

}
